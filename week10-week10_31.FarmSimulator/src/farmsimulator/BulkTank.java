package farmsimulator;

public class BulkTank {

    private double totalCapacity;
    private double volumeUsed = 0.0;

    public BulkTank() {
        this.totalCapacity = 2000;
    }

    public BulkTank(double capacity) {
        if (capacity > 0.0) {
            this.totalCapacity = capacity;
        } else {
            this.totalCapacity = 0.0;
        }
    }

    public double getCapacity() {
        return totalCapacity;
    }

    public double getVolume() {
        return volumeUsed;
    }

    public double howMuchFreeSpace() {
        return totalCapacity - volumeUsed;
    }

    public void addToTank(double amount) {
        if (volumeUsed + amount > totalCapacity) {
            volumeUsed = totalCapacity;
        } else {
            volumeUsed += amount;
        }
    }

    public double getFromTank(double amount) {
        if (volumeUsed - amount < 0) {
            double allTaken = volumeUsed;
            this.volumeUsed = 0;
            return allTaken;
        }
        this.volumeUsed -= amount;

        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(volumeUsed) + "/" + Math.ceil(totalCapacity);
    }
}
