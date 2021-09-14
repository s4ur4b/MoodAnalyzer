public class MoodAnalysisException extends Exception {
    exceptionType type;

    enum exceptionType {
        EMPTY,NULL
    }

    public MoodAnalysisException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
