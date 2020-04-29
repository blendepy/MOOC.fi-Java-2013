package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean onOff;

    public Thermometer() {
        this.onOff = false;
    }

    @Override
    public boolean isOn() {
        return onOff;
    }

    @Override
    public void on() {
        this.onOff = true;
    }

    @Override
    public void off() {
        this.onOff = false;
    }

    @Override
    public int measure() {
        if (this.onOff == false) {
            throw new IllegalStateException("Not ON");
        }
        Random random = new Random();
        return random.nextInt(60) - 30;
    }
}
