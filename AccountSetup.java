// Miklos vadasaz, 4/7/25, Account setup //
import java.util.*;
public class AccountSetup {

    public static void main(String[]args){

        Scanner input = new Scanner (System.in);

        String password;
        String username;

        System.out.println("Enter a username: ");
        username = input.next();

        System.out.println("Enter a password at least 8 characters long: ");
        password = input.next();


        int passlength = password.length();

        while (passlength < 8){
            System.out.println("Enter a password at least 8 characters long: ");
            password = input.next();
        }while (passlength >= 8){
            System.out.println("Your username is: " + username + " And your password is: " + password);
            password = input.next();
        }

        


            
        
        
        


    }
}