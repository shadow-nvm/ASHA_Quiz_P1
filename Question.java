import java.util.List;

/**
 * One awareness scenario: the situation, the possible responses,
 * the index of the safest response, and an explanation of why.
 *
 * This class only holds data. All the interactive logic lives in Quiz.
 */
public class Question {

    private final String scenario;
    private final List<String> options;
    private final int correctIndex;
    private final String explanation;
    private final String source;

    public Question(String scenario,
                    List<String> options,
                    int correctIndex,
                    String explanation,
                    String source) {

        if (options == null || options.size() < 2) {
            throw new IllegalArgumentException("A question needs at least 2 options.");
        }
        if (correctIndex < 0 || correctIndex >= options.size()) {
            throw new IllegalArgumentException("correctIndex out of range for: " + scenario);
        }

        this.scenario = scenario;
        this.options = List.copyOf(options);
        this.correctIndex = correctIndex;
        this.explanation = explanation;
        this.source = source;
    }

    public String getScenario() {
        return scenario;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectIndex() {
        return correctIndex;
    }

    public String getCorrectOptionText() {
        return options.get(correctIndex);
    }

    public String getExplanation() {
        return explanation;
    }

    public String getSource() {
        return source;
    }
}
