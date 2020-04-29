
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> addPlayer;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.addPlayer = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.addPlayer.size() >= this.maxSize) {
        } else {
            this.addPlayer.add(player);
        }
    }

    public void printPlayers() {
        for (Player count : this.addPlayer) {
            System.out.println(count.toString());
        }
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.addPlayer.size();
    }

    public int goals() {
        int numberGoals = 0;
        for (Player countGoals : addPlayer) {
            numberGoals += countGoals.goals();
        }
        return numberGoals;
    }
}
