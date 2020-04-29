package movable;

import java.util.*;

public class Group implements Movable {

    private List<Movable> group = new ArrayList<Movable>();

    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable object : group) {
            object.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String line = "";
        for (Movable object : group) {
            line += object.toString() + "\n";
        }
        return line;
    }
}
