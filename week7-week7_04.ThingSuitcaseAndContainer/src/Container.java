
import java.util.ArrayList;

public class Container {

    private ArrayList<Suitcase> container;
    private int containerWeightLimit;

    public Container(int containerWeightLimit) {
        this.containerWeightLimit = containerWeightLimit;
        this.container = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.containerWeightCount() + suitcase.totalWeight() <= containerWeightLimit) {
            container.add(suitcase);
        }
    }

    public int containerWeightCount() {
        int totalWeightOfContainer = 0;
        for (Suitcase suitcase : container) {
            totalWeightOfContainer += suitcase.totalWeight();
        }
        return totalWeightOfContainer;
    }

    public void printThings() {
        for (Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }

    @Override
    public String toString() {
        return container.size() + " suitcases (" + containerWeightCount() + " kg)";
    }

}
