import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void MoodTest_Sad(){
        String moodMessage = "I am in Sad mood";

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood(moodMessage);
    }

    @Test
    public void MoodTest_Happy(){
        String moodMessage = "I am in Any mood";

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood(moodMessage);
    }
}
