package boxes;

import java.util.*;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> list;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int used = 0;
        for (Thing oneThing : list) {
            used += oneThing.getWeight();
        }
        if (used + thing.getWeight() <= maxWeight) {
            list.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return list.contains(thing);
    }
}
