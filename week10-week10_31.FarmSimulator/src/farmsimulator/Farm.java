package farmsimulator;

import java.util.*;

public class Farm implements Alive {

    private String ownerName;
    private Barn barn;
    private List<Cow> cows;

    public Farm(String ownerName, Barn barn) {
        this.ownerName = ownerName;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }

    public String getOwner() {
        return ownerName;
    }

    public void addCow(Cow cow) {
        cows.add(cow);
    }

    public void manageCows() {
        this.barn.takeCareOf(cows);
    }

    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }

    @Override
    public String toString() {
        return "Farm owner: " + ownerName + "\n"
                + "Barn bulk tank: " + barn.toString() + "\n"
                + this.printCows();
    }

    @Override
    public void liveHour() {
        for (Cow cow : cows) {
            cow.liveHour();
        }
    }

    private String printCows() {
        if (this.cows.isEmpty()) {
            return "No cows.";
        }
        String line = "";
        for (Cow cow : cows) {
            line += "\n        " + cow.toString();
        }
        return "Animals:" + line;
    }
}
