
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BirdWatcher test = new BirdWatcher(reader);

        System.out.println("Hello! Enter commands: 'add' | 'observation' | 'statistics' | 'show' | 'quit'");

        menu(reader, test);
    }

    public static void menu(Scanner reader, BirdWatcher test) {
        while (true) {
            System.out.print("Your request: ");
            String userInput = reader.nextLine();

            if (userInput.equalsIgnoreCase("Quit")) {
                break;
            } else if (userInput.equalsIgnoreCase("Add")) {
                test.addBird(reader);
            } else if (userInput.equalsIgnoreCase("Observation")) {
                test.Observation(reader);
            } else if (userInput.equalsIgnoreCase("Statistics")) {
                test.Statistics();
            } else if (userInput.equalsIgnoreCase("Show")) {
                test.showSpecificBird(reader);
            } else {
                System.out.println("Please enter a valid command");
            }
        }
    }
}
