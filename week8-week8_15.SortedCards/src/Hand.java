
import java.util.*;

public class Hand implements Comparable<Hand> {

    private List<Card> playerCards;

    public Hand() {
        this.playerCards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.playerCards.add(card);
    }

    public void print() {
        for (Card card : playerCards) {
            System.out.println(card);
        }
    }

    public void sort() {
        Collections.sort(playerCards);
    }

    @Override
    public int compareTo(Hand o) {
        int sum1 = 0;
        int sum2 = 0;

        for (Card a : this.playerCards) {
            sum1 += a.getValue();
        }
        for (Card b : o.playerCards) {
            sum2 += b.getValue();
        }
        return sum1 - sum2;
    }

    public void sortAgainstSuit() {
        Collections.sort(playerCards, new SortAgainstSuitAndValue());
    }
}
