
import java.util.*;


public class Routes {

 private HashMap<String, String> planeRouts;

    public Routes() {
        this.planeRouts = new HashMap<String, String>();
    }

    public void addRoute(String planeID, String from, String to) {
        String flight = "(" + from + "-" + to + ")";
        this.planeRouts.put(flight, planeID);
    }

    public void printRoutes(Airplane plane){
        for (String string : planeRouts.keySet()) {
            //print planeInfo using 
            System.out.println(plane.printPlaneInfo(planeRouts.get(string))+ " " + string);
        }
    }
}
