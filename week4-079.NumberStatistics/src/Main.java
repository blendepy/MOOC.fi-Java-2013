
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            } else if (input % 2 == 0) {
                sum.addNumber(input);
                even.addNumber(input);
            } else {
                odd.addNumber(input);
                sum.addNumber(input);
            }
        }

        System.out.println("Sum: " + sum.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());

        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
    }
}
