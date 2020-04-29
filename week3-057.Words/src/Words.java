
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            words.add(input);
            if (input.isEmpty()) {
                break;
            }
        }
        for (String i : words) {
            System.out.println("You typed the following words: " + i);
        }

    }
}
