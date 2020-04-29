
import java.util.*;

public class Box implements ToBeStored {

    private double maxBoxWeight;
    private ArrayList<ToBeStored> box;

    public Box(double maxBoxWeight) {
        this.box = new ArrayList<ToBeStored>();
        this.maxBoxWeight = maxBoxWeight;
    }

    public void add(ToBeStored stored) {
        if (stored.weight() <= this.maxBoxWeight - this.weight()) {
            this.box.add(stored);
        }
    }

    public int totalThingsStored() {
        return this.box.size();
    }

    @Override
    public double weight() {
        double totalWeightOfThings = 0;
        for (ToBeStored stored : this.box) {
            totalWeightOfThings += stored.weight();
        }
        return totalWeightOfThings;
    }

    @Override
    public String toString() {
        return "Box: " + totalThingsStored() + " things, total weight " + weight() + " kg";
    }

}
