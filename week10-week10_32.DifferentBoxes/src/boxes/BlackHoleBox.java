package boxes;

import java.util.*;

public class BlackHoleBox extends Box {

    private List<Thing> list = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        list.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}
