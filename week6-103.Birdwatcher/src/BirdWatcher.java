
import java.util.ArrayList;
import java.util.Scanner;

public class BirdWatcher {

    private ArrayList<Bird> birdsList;

    public BirdWatcher(Scanner input) {
        birdsList = new ArrayList<Bird>();
    }

    public void addBird(Scanner input) {
        System.out.print("Name: ");
        String normalName = input.nextLine();
        System.out.print("Latin name: ");
        String latinName = input.nextLine();
        birdsList.add(new Bird(normalName, latinName));
    }

    public void Observation(Scanner input) {
        System.out.print("What was observed: ");
        String observedBird = input.nextLine();
        int indexNumber = searchBird(observedBird);

        if (!birdsList.isEmpty() && birdsList.get(indexNumber).getNormalName().contains(observedBird)) {
            birdsList.get(indexNumber).addObserveCount();
        } else {
            System.out.println("No such bird!");
        }
    }

    public void showSpecificBird(Scanner input) {
        System.out.print("Which bird: ");
        String specificBird = input.nextLine();
        int indexNumber = searchBird(specificBird);

        if (!birdsList.isEmpty() && birdsList.get(indexNumber).getNormalName().contains(specificBird)) {
            printBird(indexNumber);
            System.out.println("");
        } else {
            System.out.println("No such bird!");
        }
    }

    public void Statistics() {
        for (int i = 0; i < birdsList.size(); i++) {
            printBird(i);
            System.out.println("");
        }
    }

    private void printBird(int i) {
        System.out.print("Name: " + birdsList.get(i).getNormalName()
                + " | Latin name: " + birdsList.get(i).getLatinName()
                + " | " + birdsList.get(i).getObserveCount() + " observations");
    }

    private int searchBird(String string) {
        int indexNumber = 0;

        for (int i = 0; i < birdsList.size(); i++) {
            if (birdsList.get(i).getNormalName().contains(string)) {
                indexNumber = i;
            }
        }
        return indexNumber;
    }
}
