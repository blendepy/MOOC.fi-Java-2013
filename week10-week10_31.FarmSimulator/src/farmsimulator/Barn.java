package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank() {
        return this.bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow) {
        this.checkIfMilkingRobotInstalled();
        this.milkingRobot.milk(cow);
    }

    public void takeCareOf(Collection<Cow> cows) {
        this.checkIfMilkingRobotInstalled();
        for (Cow cow : cows) {
            this.milkingRobot.milk(cow);
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }

    private void checkIfMilkingRobotInstalled() {
        if (this.milkingRobot == null) {
            throw new IllegalStateException("Install a MilkingRobot first");
        }
    }
}
