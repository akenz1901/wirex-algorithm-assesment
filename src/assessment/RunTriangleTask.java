package assessment;

public class RunTriangleTask {

    public static void main(String... args) {

        TriangleTask triangleTask = new TriangleTask("height");

        int wordLength = triangleTask.getWord().length();
        String asteriks = "";
        for(int i = 0; i < wordLength; i++){
            asteriks += "*";
            System.out.println(asteriks);
        }
    }
}
