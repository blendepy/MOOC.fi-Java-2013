
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points [0-60]: ");
        int value = Integer.parseInt(reader.nextLine());

        if (value <= 29) {
            System.out.println("Grade: failed");
        } else if (value <= 34) {
            System.out.println("Grade: 1");
        } else if (value <= 39) {
            System.out.println("Grade: 2");
        } else if (value <= 44) {
            System.out.println("Grade: 3");
        } else if (value <= 49) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
