import java.util.Scanner;

/**
 * Entry point for the Project A.S.H.A. Awareness & Risk Assessment Tool.
 *
 * This tool is educational only. It does not collect, store or transmit
 * any personal information, and it never asks about the user's own
 * experiences.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        printBanner();

        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    new Quiz(QuestionBank.getAll(), scanner).run();
                    waitForEnter(scanner);
                    break;

                case "2":
                    printAbout();
                    waitForEnter(scanner);
                    break;

                case "3":
                    Resources.print();
                    waitForEnter(scanner);
                    break;

                case "4":
                case "q":
                case "Q":
                    running = false;
                    System.out.println();
                    System.out.println("Thanks for taking the time to learn about this. Stay safe.");
                    break;

                default:
                    System.out.println();
                    System.out.println("Please enter 1, 2, 3 or 4.");
            }
        }

        scanner.close();
    }

    private static void printBanner() {
        System.out.println();
        System.out.println("============================================================");
        System.out.println("  PROJECT A.S.H.A.");
        System.out.println("  Awareness & Risk Assessment Tool  -  Mini Project 01");
        System.out.println("============================================================");
        System.out.println("  A short educational quiz about human trafficking and");
        System.out.println("  exploitation. You will be shown real-world style");
        System.out.println("  scenarios and asked what you would do.");
        System.out.println();
        System.out.println("  This tool does not collect or store any personal data.");
        System.out.println("============================================================");
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println(" MAIN MENU");
        System.out.println("------------------------------------------------------------");
        System.out.println(" 1. Start the awareness quiz");
        System.out.println(" 2. About this tool & how scoring works");
        System.out.println(" 3. Helplines & further reading");
        System.out.println(" 4. Exit");
        System.out.print(" Choose an option: ");
    }

    private static void printAbout() {
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println(" ABOUT THIS TOOL");
        System.out.println("------------------------------------------------------------");
        System.out.println(" This is an educational awareness tool built for Project");
        System.out.println(" A.S.H.A. It is NOT a diagnostic or risk-scoring test, and");
        System.out.println(" it cannot tell you whether a real situation is trafficking.");
        System.out.println();
        System.out.println(" Each question describes a scenario based on widely reported");
        System.out.println(" recruitment and exploitation tactics. You pick the safest");
        System.out.println(" response. At the end you get a score, an explanation for");
        System.out.println(" every answer, and a list of verified resources.");
        System.out.println();
        System.out.println(" SCORING");
        System.out.println("   One point per question. The result only shows which");
        System.out.println("   warning signs you already recognise and which ones are");
        System.out.println("   worth reading up on.");
        System.out.println();
        System.out.println(" PRIVACY");
        System.out.println("   Everything runs locally on your computer. No personal");
        System.out.println("   information is collected, stored or sent anywhere, and");
        System.out.println("   you are never asked about your own experiences.");
    }

    private static void waitForEnter(Scanner scanner) {
        System.out.println();
        System.out.print("Press Enter to return to the menu...");
        scanner.nextLine();
    }
}
