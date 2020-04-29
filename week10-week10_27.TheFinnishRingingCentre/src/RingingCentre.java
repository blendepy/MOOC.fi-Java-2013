
import java.util.*;

public class RingingCentre {

    private Map<Bird, List<String>> dataBase;

    public RingingCentre() {
        this.dataBase = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (!this.dataBase.keySet().contains(bird)) {
            places.add(place);
            this.dataBase.put(bird, places);
        } else {
            places = dataBase.get(bird);
            places.add(place);
            dataBase.put(bird, places);
        }
    }

    public void observations(Bird bird) {
        if (this.dataBase.get(bird) == null) {
            System.out.println(bird.toString() + " observations: 0");
        } else {
            System.out.println(bird.toString() + " observations: " + this.dataBase.get(bird).size());
            System.out.println(dataBase.get(bird));
        }
    }
}
