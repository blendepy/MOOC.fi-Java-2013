
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your username: ");
        String nameIn = reader.nextLine();
        System.out.print("Type your password: ");
        String passIn = reader.nextLine();
        
        String name1 = "alex";
        String pass1 = "mightyducks";
        String name2 = "emily";
        String pass2 = "cat";
        
        if (nameIn.equals(name1) && passIn.equals(pass1)) {
            System.out.println("You are now logged into the system!");
        }else if (nameIn.equals(name2) && passIn.equals(pass2)) {
            System.out.println("You are now logged into the system!");
        }else
            System.out.println("Your username or password was invalid!");

    }
}
