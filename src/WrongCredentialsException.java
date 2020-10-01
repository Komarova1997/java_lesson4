public class WrongCredentialsException extends Exception{
    private final String message;

    WrongCredentialsException(String message){
        super();
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}