package moving.domain;

import java.util.*;

public class Box implements Thing {

    private int maximumCapacity;
    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (thing.getVolume() <= this.maximumCapacity - this.getVolume()) {
            this.box.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int capacity = 0;
        for (Thing thing : box) {
            capacity += thing.getVolume();
        }
        return capacity;
    }

    @Override
    public String toString() {
        return box.toString();
    }

}
