public class TooManyLoginAttemptsException extends Exception{
    private final String message;

    TooManyLoginAttemptsException(String message){
        super();
        this.message = message;
    }

    TooManyLoginAttemptsException(){
        super();
        this.message = "Error: the attempts ended";
    }

    public String getMessage(){
        return message;
    }
}