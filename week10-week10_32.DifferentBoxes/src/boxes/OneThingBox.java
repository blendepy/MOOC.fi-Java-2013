package boxes;

import java.util.*;

public class OneThingBox extends Box {

    private List<Thing> list = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        if (list.isEmpty()) {
            list.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return list.contains(thing);
    }
}
