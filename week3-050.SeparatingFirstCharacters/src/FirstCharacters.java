
import java.util.Scanner;

public class FirstCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();

        if (name.length() >= 4) {
            System.out.println("1. Character: " + name.charAt(0));
            System.out.println("2. Character: " + name.charAt(1));
            System.out.println("3. Character: " + name.charAt(2));
        } else {

        }

    }
}
