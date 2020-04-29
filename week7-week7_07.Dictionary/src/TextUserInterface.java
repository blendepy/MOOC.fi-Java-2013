
import java.util.*;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Statement: ");

            String userInput = this.reader.nextLine();

            if (userInput.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (userInput.equalsIgnoreCase("add")) {
                add(reader);
            } else if (userInput.equalsIgnoreCase("translate")) {
                translate(reader);
            } else {
                System.out.println("Unknown statement");
            }
            System.out.println("");
        }
    }

    public void add(Scanner reader) {

        System.out.print("In Finnish: ");
        String orininalWord = reader.nextLine();

        System.out.print("Translation: ");
        String translationWord = reader.nextLine();

        dictionary.add(orininalWord, translationWord);
    }

    public void translate(Scanner reader) {

        System.out.print("Give a word: ");
        String input = reader.nextLine();

        System.out.println("Translation: " + dictionary.translate(input));

    }
}
