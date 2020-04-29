package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> allSensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.allSensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public List<Integer> readings() {
        return readings;
    }

    public void addSensor(Sensor additional) {
        this.allSensors.add(additional);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : allSensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : allSensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor Sensor : allSensors) {
            Sensor.off();
        }
    }

    @Override
    public int measure() {
        if (this.isOn() == false || this.allSensors.isEmpty()) {
            throw new IllegalStateException("oh NONONONO");
        }
        int count = 0;
        for (Sensor sensor : allSensors) {
            count += sensor.measure();
        }
        int averageTemp = count / this.allSensors.size();
        readings.add(averageTemp);
        return averageTemp;
    }

}
