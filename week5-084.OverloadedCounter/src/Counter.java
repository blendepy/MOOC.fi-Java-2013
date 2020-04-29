
public class Counter {

    private int number;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.number = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number++;
    }

    public void increase(int Amount) {
        if (Amount < 0) {

        } else {
            this.number += Amount;
        }
    }

    public void decrease() {
        if (this.number < 1 && check == true) {

        } else {
            this.number--;
        }
    }

    public void decrease(int Amount) {
        if (Amount < 0) {

        } else if (check == true) {
            this.number = 0;
        } else {
            this.number -= Amount;
        }
    }
}
