package assessment;

import assessment.Exceptions.InvalidWordException;

public class TriangleTask {

    private String word;

    public TriangleTask(String word){
        validateWord(word);
        this.word = word;
    }

    public void setWord(String word){
        validateWord(word);
        this.word = word;
    }
    public String getWord(){
        return word;
    }

    private void validateWord(String word){
        boolean checkWord = 0 < word.length() && word.length() < 10;
        if(!checkWord){
            throw new InvalidWordException("Word cannot be greater than 9 or less 1");
        }
    }
}
