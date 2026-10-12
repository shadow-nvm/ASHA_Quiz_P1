import java.util.List;

/**
 * Holds all the quiz content in one place, so questions can be edited
 * without touching any of the quiz logic.
 *
 * Content is based on publicly available information from the UNODC,
 * the ILO, the IOM and the UN Trafficking in Persons Protocol.
 */
public final class QuestionBank {

    // Utility class - never instantiated.
    private QuestionBank() {
    }

    public static List<Question> getAll() {
        return List.of(

            // ---------------------------------------------------------- 1
            new Question(
                "A recruiter offers you a job as a hotel housekeeper in another country. "
                    + "The pay is four times what you earn now. The recruiter says the visa "
                    + "'processing' requires you to hand over your original passport, and that "
                    + "they will keep it safe until you reach the employer.",

                List.of(
                    "Hand it over. Keeping a passport during visa processing is completely normal.",
                    "Show the passport so the details can be checked, but keep the original with "
                        + "you and get the job offer in writing.",
                    "Hand it over, but ask for a signed receipt so you can prove you gave it to them.",
                    "Hand it over and sign the blank forms they give you, so the process is not delayed."
                ),
                1,

                "A genuine employer or agent may need to SEE your passport, but there is no "
                    + "legitimate reason for anyone to KEEP your original identity documents. "
                    + "Control of a worker's passport or ID is one of the internationally "
                    + "recognised indicators of forced labour and trafficking. Before accepting "
                    + "any overseas job, check that the recruiter is licensed (in India, through "
                    + "the eMigrate portal) and insist on a written contract.",

                "ILO indicators of forced labour; UN Trafficking in Persons Protocol; "
                    + "India eMigrate portal (emigrate.gov.in)"
            ),

            // ---------------------------------------------------------- 2
            new Question(
                "A recruitment agent tells you a job is 'completely free'. Later he says you "
                    + "must pay 1,50,000 rupees as a 'processing and training fee'. You do not "
                    + "have the money, so he offers to lend it to you and says you can repay it "
                    + "from your first few salaries.",

                List.of(
                    "Accept. Everyone pays agents something, and the salary will cover it quickly.",
                    "Accept, but negotiate a lower interest rate on the loan.",
                    "Refuse, and ask the employer in writing who is responsible for recruitment "
                        + "costs. A real job should never leave you in debt to the agent or employer.",
                    "Borrow the money from a moneylender and pay the agent so you do not miss the "
                        + "opportunity."
                ),
                2,

                "Recruitment fees that push a worker into debt are a form of debt bondage, and "
                    + "debt bondage is one of the core indicators of forced labour. International "
                    + "labour standards state that recruitment fees and related costs should not "
                    + "be borne by the worker - this is known as the 'employer pays' principle. "
                    + "If you had to borrow money to get the job, that debt can be used to control you.",

                "ILO General Principles and Operational Guidelines for Fair Recruitment; "
                    + "ILO indicators of forced labour"
            ),

            // ---------------------------------------------------------- 3
            new Question(
                "A neighbour offers to take your 14-year-old cousin to the city for a "
                    + "'well-paid job in a shop'. There is no written offer, no address for the "
                    + "employer, and he wants the family to accept 20,000 rupees in cash as an "
                    + "advance. The family is struggling financially.",

                List.of(
                    "Let the cousin go. It is a good opportunity for a family that needs money.",
                    "Tell the family to negotiate for a bigger advance before agreeing.",
                    "Refuse the offer and report it. A child cannot consent to this, and "
                        + "trafficking of a child does not require proof of force or fraud. "
                        + "Contact Childline 1098 or the local police.",
                    "Ask the neighbour to write a promise on paper, then decide."
                ),
                2,

                "Under the UN Trafficking in Persons Protocol, when the victim is a child "
                    + "(under 18), trafficking is established even if there was no force, fraud "
                    + "or coercion. An informal 'job offer' for a minor - with no employer "
                    + "details, no contract, and cash paid to the family - is a serious red flag. "
                    + "Childline (1098) and the police are the right people to contact.",

                "UN Protocol to Prevent, Suppress and Punish Trafficking in Persons (Article 3); "
                    + "Childline India 1098"
            ),

            // ---------------------------------------------------------- 4
            new Question(
                "You are offered work abroad. At the airport, the agent hands you a contract "
                    + "written in a language you cannot read and says: 'Do not worry, it is the "
                    + "standard form. Just sign it, we have a flight to catch.'",

                List.of(
                    "Sign it. You can sort out the details once you start working.",
                    "Sign it, but secretly photograph the pages so you have a record.",
                    "Refuse to sign until you have a copy in a language you understand, have read "
                        + "it, and can keep your own copy.",
                    "Ask a friend to sign it on your behalf."
                ),
                2,

                "Never sign a document you cannot read. Ask for the contract in advance, in a "
                    + "language you understand, and keep your own copy. A proper contract should "
                    + "state who the employer is, the job, the salary, working hours, any "
                    + "deductions, and how you can leave the job. Pressure to sign quickly, at "
                    + "the last minute, is itself a warning sign.",

                "ILO fair recruitment guidance; IOM counter-trafficking information"
            ),

            // ---------------------------------------------------------- 5
            new Question(
                "At a construction site you start talking to a worker. A man standing nearby "
                    + "answers every question for him, holds his ID and his phone, and the worker "
                    + "seems afraid to speak. He says he owes money and cannot leave.",

                List.of(
                    "Ignore it. It is between the worker and the man.",
                    "Confront the man and take the worker away with you straight away.",
                    "Stay calm, do not confront anyone, note the location and what you saw, and "
                        + "report it to the police or an anti-trafficking helpline.",
                    "Tell the worker to run away with you right then."
                ),
                2,

                "This situation matches several recognised indicators of forced labour at once: "
                    + "retention of identity documents, debt bondage, restriction of movement, and "
                    + "control by another person. Confronting a suspected trafficker can put both "
                    + "you and the worker in danger. The safest action is to pass what you observed "
                    + "to the police or a helpline, who can carry out a proper and safe intervention.",

                "ILO indicators of forced labour; UNODC human trafficking resources"
            ),

            // ---------------------------------------------------------- 6
            new Question(
                "A 16-year-old you know gets a message on social media: 'You have a great look. "
                    + "We can get you modelling work abroad. Send some photos and travel alone to "
                    + "meet our client. Do not tell your parents, they will only worry.'",

                List.of(
                    "It is probably genuine. Modelling agencies do contact people on social media.",
                    "Reply and ask for more details before deciding anything.",
                    "Tell a trusted adult, keep the messages as evidence, do not send photos, do "
                        + "not travel or meet alone, and report the account.",
                    "Go along to the meeting as a friend, so the teenager is not alone."
                ),
                2,

                "Secrecy, isolating a young person from their family, requests for photos, and "
                    + "pressure to travel alone to meet an unknown 'client' are classic grooming "
                    + "and trafficking recruitment tactics. Real agencies have verifiable addresses "
                    + "and contracts, and they do not ask minors to hide things from their parents. "
                    + "Report the account on the platform as well.",

                "UNODC on online recruitment and trafficking; IOM counter-trafficking information"
            ),

            // ---------------------------------------------------------- 7
            new Question(
                "You accept a job in City A. On the way, the agent says the employer in City A "
                    + "has cancelled and you are now going to City B. Then the destination changes "
                    + "again, your phone is taken 'for safekeeping', and you are told you will be "
                    + "paid only after you arrive.",

                List.of(
                    "Keep going. These things happen, and you have already spent money on the journey.",
                    "Wait until you arrive and decide what to do then.",
                    "Ask for your phone back and carry on to the new destination.",
                    "Get help immediately: alert someone you trust with your location, contact the "
                        + "police or a helpline, and do not continue the journey."
                ),
                3,

                "Repeated last-minute changes of destination, confiscation of a phone, and payment "
                    + "promised only after arrival are serious red flags. Changing destinations "
                    + "mid-journey is a known tactic for moving a person away from anyone who could "
                    + "help them, and taking a phone removes your ability to call for help.",

                "ILO indicators of forced labour; UNODC human trafficking resources"
            ),

            // ---------------------------------------------------------- 8
            new Question(
                "You notice a group of young people living and working at a small workshop near "
                    + "your home. They work very late, sleep on the premises, and never seem to leave.",

                List.of(
                    "Post about it on social media, with photos, to raise awareness.",
                    "Do nothing. It is not your business.",
                    "Note down what you observed - the location, times and how many people - and "
                        + "report it to the police or an anti-trafficking helpline. Do not post "
                        + "photos or names.",
                    "Go to the workshop gate and ask the workers directly whether they are being "
                        + "trafficked."
                ),
                2,

                "Reporting to the police or a helpline lets trained responders assess the situation "
                    + "safely. Do not confront suspected traffickers, do not enter the premises, and "
                    + "never share the workers' photos or identities online - that can put them at "
                    + "greater risk. If you believe someone is in immediate danger, call the "
                    + "emergency number.",

                "UNODC human trafficking resources; India anti-trafficking helpline"
            )
        );
    }
}
