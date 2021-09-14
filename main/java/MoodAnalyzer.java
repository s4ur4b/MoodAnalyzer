public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    //Handle NULLPOINTER Exception using try-catch block
    public String analyzeMood() throws MoodAnalysisException {

        try {
            if (message.length() == 0 )
                throw new MoodAnalysisException(MoodAnalysisException.exceptionType.EMPTY,"Message cannot be empty");
            if (message.contains("Sad")) {
                return "SAD";
            } else
                return "HAPPY";

        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.exceptionType.NULL,"Message cannot be Null");
        }
    }
}
