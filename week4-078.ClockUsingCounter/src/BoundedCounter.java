
public class BoundedCounter {

    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > upperLimit) {
            this.value = 0;
        }

    }

    @Override
    public String toString() {
        if (this.value <= 9) {
            return "0" + value;
        }
        return "" + value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.upperLimit) {

        } else {
            this.value = value;
        }
    }

}
