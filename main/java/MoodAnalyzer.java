public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Handle NULLPOINTER Exception using try-catch block
    public String analyzeMood() {

        try {
            if (message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";

        } catch (Exception e) {

            return "Happy";
        }
    }
}
