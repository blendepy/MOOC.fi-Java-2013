
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Thing> suitcase;
    private int suitcaseWeightLimit;

    public Suitcase(int suitcaseWeightLimit) {
        this.suitcase = new ArrayList<Thing>();
        this.suitcaseWeightLimit = suitcaseWeightLimit;
    }

    public void addThing(Thing thing) {
        if (thing.getWeight() + totalWeight() <= suitcaseWeightLimit) {
            suitcase.add(thing);
        }
    }

    public void printThings() {
        for (Thing thing : suitcase) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int totalWeightOfSuitcase = 0;
        for (Thing thing : suitcase) {
            totalWeightOfSuitcase += thing.getWeight();
        }
        return totalWeightOfSuitcase;
    }

    public Thing heaviestThing() {
        if (suitcase.isEmpty()) {
            return null;
        }
        Thing heaviestSoFar = suitcase.get(0);

        for (Thing thing : suitcase) {
            if (thing.getWeight() > heaviestSoFar.getWeight()) {
                heaviestSoFar = thing;
            }
        }
        return heaviestSoFar;
    }

    @Override
    public String toString() {
        if (suitcase.isEmpty()) {
            return "empty (0 kg)";
        } else if (suitcase.size() == 1) {
            return "1 thing (" + totalWeight() + " kg)";
        }
        return suitcase.size() + " things (" + totalWeight() + " kg)";
    }

}
