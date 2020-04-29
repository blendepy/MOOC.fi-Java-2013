
public class Calculator {

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void sum(int number) {
        value += number;
    }

    public void minus(int number) {
        value -= number;
    }
}
