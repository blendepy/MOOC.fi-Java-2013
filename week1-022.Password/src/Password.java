
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.print("Type the password: ");
            String uInput = reader.nextLine();
            if (uInput.equals(password)) {
                System.out.println("Right!");
                System.out.println(" ");
                System.out.println("The secret is: I'm dumb :(");
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
    }
}
