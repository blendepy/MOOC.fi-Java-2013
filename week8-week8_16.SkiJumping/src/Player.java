
import java.util.*;

public class Player implements Comparable<Player> {

    private String name;
    private List<Jump> points;

    public Player(String name) {
        this.name = name;
        this.points = new ArrayList<Jump>();
    }

    public String getName() {
        return this.name;
    }

    public void jump(int round) {
        this.points.add(round, new Jump());
    }

    public Jump getJump(int round) {
        return this.points.get(round);
    }

    public int getTotalPointsInAllRounds() {
        int total = 0;
        for (Jump jump : this.points) {
            total += jump.getTotalPointsInOneJump();
        }
        return total;
    }

    public String printPlayerResults() {
        return this.name + " (" + this.getTotalPointsInAllRounds() + " points)";
    }

    public String printLengths() {
        String printLengths = "";
        for (Jump jump : this.points) {
            printLengths += " " + jump.getLength() + " m,";
        }
        printLengths = printLengths.substring(0, printLengths.length() - 1);
        return printLengths;
    }

    @Override
    public int compareTo(Player o) {
        return o.getTotalPointsInAllRounds() - this.getTotalPointsInAllRounds();
    }

    @Override
    public String toString() {
        return "           " + this.printPlayerResults() + "\n            jump lengths:" + this.printLengths();
    }
}
