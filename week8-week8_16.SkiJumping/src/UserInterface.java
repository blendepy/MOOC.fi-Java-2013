
import java.util.*;

public class UserInterface {

    private Scanner reader = new Scanner(System.in);
    private List<Player> listOfPlayers = new ArrayList<Player>();

    public void Start() {
        System.out.println("Kumpula ski jumping week");

        addNames();
        rounds();
        overallResults();
    }

    public void addNames() {
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while (true) {
            System.out.print("  Participant name: ");
            String enterName = reader.nextLine();
            if (enterName.isEmpty()) {
                break;
            }
            listOfPlayers.add(new Player(enterName));
        }
    }

    public void rounds() {
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
        
        int round = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            if (!input.equals("jump")) {
                break;
            }
            System.out.println("");
            System.out.println("Round " + round);
            System.out.println("");
            System.out.println("Jumping order:");
            
            sortPlayers(round);
            
            System.out.println("");
            System.out.println("Results of round " + round);
            
            jump(round - 1);
            
            round++;
        }
    }

    public void sortPlayers(int round) {
        Collections.sort(listOfPlayers);
        Collections.reverse(listOfPlayers);
        
        int i = 1;
        for (Player player : listOfPlayers) {
            System.out.println("  " + i + ". " + player.printPlayerResults());
            i++;
        }
    }

    public void jump(int round) {
        for (Player a : listOfPlayers) {
            a.jump(round);
            System.out.println("  " + a.getName());
            System.out.println(a.getJump(round));
            System.out.println("");
        }
    }

    public void overallResults() {
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results: ");
        System.out.println("Position    Name");
        
        Collections.sort(listOfPlayers);
        
        int i = 1;
        for (Player player : listOfPlayers) {
            System.out.println(i + "" + player);
            i++;
        }
    }
}
