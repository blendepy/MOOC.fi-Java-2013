
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        
        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        System.out.print("Type second: ");
        read += Integer.parseInt(reader.nextLine());
        System.out.print("Type third: ");
        read += Integer.parseInt(reader.nextLine());
        sum = sum + read;
        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
    }
}
