package containers;

import java.util.*;

public class ContainerHistory {

    private List<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation) {
        history.add(situation);
    }

    public void reset() {
        history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        }
        return Collections.min(history);
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        }
        double value = 0;
        for (double count : this.history) {
            value += count;
        }
        return value / this.history.size();
    }

    public double greatestFluctuation() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        double maxFluctuation = Math.abs(this.history.get(0) - this.history.get(1));
        for (int i = 0; i < this.history.size() - 1; i++) {
            double temp = Math.abs(this.history.get(i) - this.history.get(i + 1));
            if (temp > maxFluctuation) {
                maxFluctuation = temp;
            }
        }
        return Math.abs(maxFluctuation);
    }

    public double variance() {
        if (this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        double value = 0;
        for (double count : this.history) {
            value += Math.pow(count - this.average(), 2);
        }
        return value / (this.history.size() - 1);
    }

    @Override
    public String toString() {
        return history.toString();
    }
}
