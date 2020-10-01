import java.io.IOException;

public class Main {
    public static void main(String[] args){

        Person person1 = new Person("Dima Alexandrov", "27.06.1995");
        Person person2 = new Person("Lisa Komarova", "15.06.1997");
        Person person3 = new Person("Arina Zayceva", "19.04.2000");

        AccountManagerImpl manager = new AccountManagerImpl();

        try {
            manager.registerNewAccount("email1", "333", person1);
            manager.registerNewAccount("email2", "111", person2);
            manager.registerNewAccount("email3", "222", person3);

            manager.registerNewAccount("email1", "password", person1);
        } catch(DuplicateAccountException | IOException e){
            System.out.println(e.getMessage());
        }

        try {
            manager.removeAccount("email1", "333");
            manager.removeAccount("email2", "111");

            manager.removeAccount("#", "#");
        }catch (WrongCredentialsException | IOException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Account true/false: " + manager.hasAccount("el"));
        }catch(IOException e){
            e.printStackTrace();
        }

        try {
            System.out.println("Number of account: " + manager.numOfAccounts());
        }catch (IOException e){
            e.printStackTrace();
        }

        authentication("emmaaaaa", "111", manager);
        authentication("emfff", "1rgbnbwv", manager);
        authentication("e34t983", "1wefnfevne", manager);
        authentication("email", "444444", manager);
        authentication("bmdf", "fnv", manager);
        authentication("grgsvdgs", "666666", manager);


    }
    public static void authentication(String email, String password, AccountManagerImpl manager) {
        try {
            System.out.println(manager.getPerson(email, password));
        } catch (WrongCredentialsException | TooManyLoginAttemptsException | IOException e){
            System.out.println(e.getMessage());
        }
    }

}