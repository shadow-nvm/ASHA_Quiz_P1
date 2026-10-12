import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Runs one full attempt of the awareness quiz: shows the questions,
 * validates the input, keeps score, and prints the result, the review
 * and the resources.
 */
public class Quiz {

    private final List<Question> questions;
    private final Scanner scanner;
    private final Random random = new Random();
    private final boolean shuffleQuestions;
    private final boolean shuffleOptions;

    /** Default quiz: question order and answer order are both shuffled. */
    public Quiz(List<Question> questions, Scanner scanner) {
        this(questions, scanner, true, true);
    }

    public Quiz(List<Question> questions, Scanner scanner,
                boolean shuffleQuestions, boolean shuffleOptions) {
        this.questions = List.copyOf(questions);
        this.scanner = scanner;
        this.shuffleQuestions = shuffleQuestions;
        this.shuffleOptions = shuffleOptions;
    }

    /** Runs the quiz from the first question through to the final result. */
    public void run() {
        List<Question> quizQuestions = new ArrayList<>(questions);
        if (shuffleQuestions) {
            Collections.shuffle(quizQuestions, random);
        }

        List<AnswerRecord> records = new ArrayList<>();
        int score = 0;

        System.out.println();
        System.out.println("You will be shown " + quizQuestions.size() + " short scenarios.");
        System.out.println("For each one, pick the SAFEST response: A, B, C or D.");
        System.out.println("There is no time limit, and nothing you type is saved.");

        for (int i = 0; i < quizQuestions.size(); i++) {
            Question question = quizQuestions.get(i);

            System.out.println();
            System.out.println("------------------------------------------------------------");
            System.out.printf(" Question %d of %d%n", i + 1, quizQuestions.size());
            System.out.println("------------------------------------------------------------");
            System.out.println(question.getScenario());
            System.out.println();

            int chosenIndex = askForAnswer(question);
            boolean correct = (chosenIndex == question.getCorrectIndex());
            if (correct) {
                score++;
            }
            records.add(new AnswerRecord(question, chosenIndex, correct));

            System.out.println(correct ? "  >> Correct." : "  >> Not the safest choice.");
        }

        printResults(score, records);
    }

    /**
     * Shows the options and reads the user's answer until it is valid.
     *
     * @return the index of the chosen option in the ORIGINAL option list
     *         (the display order may have been shuffled).
     */
    private int askForAnswer(Question question) {
        List<String> options = question.getOptions();

        // Build the order in which options will be shown, so the safest
        // answer is not always in the same position.
        List<Integer> displayOrder = new ArrayList<>();
        for (int i = 0; i < options.size(); i++) {
            displayOrder.add(i);
        }
        if (shuffleOptions) {
            Collections.shuffle(displayOrder, random);
        }

        char lastLetter = (char) ('A' + options.size() - 1);
        for (int i = 0; i < displayOrder.size(); i++) {
            char label = (char) ('A' + i);
            System.out.printf("   %c) %s%n", label, options.get(displayOrder.get(i)));
        }

        while (true) {
            System.out.printf("%nYour answer (A-%c): ", lastLetter);
            String input = scanner.nextLine().trim().toUpperCase();

            if (input.length() == 1) {
                int position = input.charAt(0) - 'A';
                if (position >= 0 && position < displayOrder.size()) {
                    return displayOrder.get(position);   // map back to the original index
                }
            }
            System.out.printf("Please enter a single letter between A and %c.%n", lastLetter);
        }
    }

    private void printResults(int score, List<AnswerRecord> records) {
        int total = records.size();
        int percent = (int) Math.round(score * 100.0 / total);

        System.out.println();
        System.out.println("============================================================");
        System.out.println("                       YOUR RESULT");
        System.out.println("============================================================");
        System.out.printf(" Score: %d / %d  (%d%%)%n", score, total, percent);
        System.out.println();
        System.out.println(" " + feedbackFor(percent));

        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println(" REVIEW: THE SAFEST RESPONSE, AND WHY");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < records.size(); i++) {
            AnswerRecord record = records.get(i);
            Question question = record.question();

            System.out.println();
            System.out.printf("%d. %s%n", i + 1, question.getScenario());
            System.out.printf("   Result        : %s%n",
                record.correct() ? "CORRECT" : "REVIEW THIS ONE");
            System.out.printf("   Your answer   : %s%n",
                question.getOptions().get(record.chosenIndex()));
            System.out.printf("   Safest answer : %s%n", question.getCorrectOptionText());
            System.out.printf("   Why           : %s%n", question.getExplanation());
            System.out.printf("   Source        : %s%n", question.getSource());
        }

        System.out.println();
        Resources.print();
    }

    private String feedbackFor(int percent) {
        if (percent >= 90) {
            return "Excellent. You recognise most of the warning signs of trafficking "
                 + "and exploitation.";
        }
        if (percent >= 70) {
            return "Good awareness. You spotted the main red flags - review the ones you missed.";
        }
        if (percent >= 50) {
            return "Basic awareness. Some very common recruitment traps were missed. "
                 + "Please read the review below.";
        }
        return "High risk. Several dangerous situations were answered unsafely. "
             + "Please read the review and the resources carefully.";
    }

    /** What the user answered for one question, kept for the end-of-quiz review. */
    private record AnswerRecord(Question question, int chosenIndex, boolean correct) {
    }
}
