package farmsimulator;

import java.util.*;

public class Cow implements Alive, Milkable {

    private String name;
    private double udderCapacity = 15 + new Random().nextInt(26);
    private double amountOfMilk;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[new Random().nextInt(NAMES.length)];
    }

    public Cow(String name) {
        this.name = name;
        this.amountOfMilk = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return amountOfMilk;
    }

    @Override
    public void liveHour() {
        this.amountOfMilk += 0.7 + (2 - 0.7) * new Random().nextDouble();
        if (this.amountOfMilk > this.udderCapacity) {
            this.amountOfMilk = udderCapacity;
        }
    }

    @Override
    public double milk() {
        double milk = this.amountOfMilk;
        this.amountOfMilk = 0.0;
        return milk;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(amountOfMilk) + "/" + udderCapacity;
    }
}
