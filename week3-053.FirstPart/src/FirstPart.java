
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        System.out.print("What length: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + input.substring(0, number));

  

        
    }
}
