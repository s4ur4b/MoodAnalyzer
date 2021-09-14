public class MoodAnalyzer {

    public void analyzeMood(String message){
        if (message.contains("Sad")){
            System.out.println("SAD");
        }else System.out.println("HAPPY");
    }

}
