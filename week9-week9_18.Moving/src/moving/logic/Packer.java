package moving.logic;

import moving.domain.*;
import java.util.*;

public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        Box oneBox = new Box(boxesVolume);
        List<Box> allBoxes = new ArrayList<Box>();

        for (Thing thing : things) {
            oneBox = new Box(boxesVolume);
            oneBox.addThing(thing);
            allBoxes.add(oneBox);
        }
        return allBoxes;
    }
}
