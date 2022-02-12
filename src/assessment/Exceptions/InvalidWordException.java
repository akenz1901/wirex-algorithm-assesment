package assessment.Exceptions;

public class InvalidWordException extends RuntimeException{

    public InvalidWordException(){}
    public InvalidWordException(String message){
        super(message);
    }
}
