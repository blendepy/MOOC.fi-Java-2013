
import java.util.Arrays;

public class Calculator {

    private Reader reader;
    private int count = 0;

    public Calculator() {
        this.reader = new Reader();
        count = 0;

    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }

    private void sum() {
        int sum = 0;

        for (int i : inputs()) {
            sum += i;
        }
        System.out.println("sum of the values " + sum);
        count++;
    }

    private void difference() {
        System.out.print("value1: ");
        int a = reader.readInteger();
        System.out.print("value2: ");
        int b = reader.readInteger();
        int diff = a - b;

        System.out.println("difference of the values " + diff);
        count++;
    }

    private void product() {
        int mult = 1;

        for (int i : inputs()) {
            mult *= i;
        }
        System.out.println("product of the values " + mult);
        count++;
    }

    private void statistics() {
        System.out.println("Calculations done " + count);
    }

    private int[] inputs() {
        int[] numbers = new int[2];
        System.out.print("value1: ");
        numbers[0] = reader.readInteger();
        System.out.print("value2: ");
        numbers[1] = reader.readInteger();
        return numbers;
    }
}
