import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void MoodTest_Sad(){

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood("I am in Sad mood");
    }

    @Test
    public void MoodTest_Happy(){

        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        moodAnalyzer.analyzeMood("I am in Any mood");
    }
}
