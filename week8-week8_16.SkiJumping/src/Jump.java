
import java.util.*;

public class Jump {

    private Integer length;
    private List<Integer> votes;
    private Random random;

    public Jump() {
        this.random = new Random();
        this.length = random.nextInt(60) + 61;
        this.votes = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            this.votes.add(this.random.nextInt(10) + 11);
        }
    }

    public int getLength() {
        return this.length;
    }

    public String printVotes() {
        String line = "[";
        for (int i = 0; i < 4; i++) {
            line += this.votes.get(i) + ", ";
        }
        line += this.votes.get(4) + "]";
        return line;
    }

    public int sumAverageVotes() {
        Collections.sort(this.votes);
        int total = 0;
        for (int i = 1; i < 4; i++) {
            total += this.votes.get(i);
        }
        return total;
    }

    public int getTotalPointsInOneJump() {
        return this.getLength() + this.sumAverageVotes();
    }

    @Override
    public String toString() {
        return "    length: " + this.length + "\n" + "    judge votes: " + this.printVotes();
    }
}
