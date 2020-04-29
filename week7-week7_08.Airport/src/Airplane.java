
import java.util.*;

public class Airplane {

    private HashMap<String, Integer> planeList;

    public Airplane() {
        this.planeList = new HashMap<String, Integer>();
    }

    public void addPlane(String planeID, int planeCapacity) {
        this.planeList.put(planeID, planeCapacity);
    }

    public void printPlanes() {
        for (String string : planeList.keySet()) {
            System.out.println(string + " (" + planeList.get(string) + " ppl)");
        }
    }

    public String printPlaneInfo(String planeID) {
        return planeID + " (" + planeList.get(planeID) + " ppl)";
    }
}
