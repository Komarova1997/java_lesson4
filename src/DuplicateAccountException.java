public class DuplicateAccountException extends Exception {
    private final String message;

    DuplicateAccountException(String message){
        super();
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
