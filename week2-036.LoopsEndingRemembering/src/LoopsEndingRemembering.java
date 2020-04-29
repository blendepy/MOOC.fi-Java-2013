
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Type numbers: ");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                System.out.println("Thank you and see you later!");
                break;
            } else {
                if (input%2 == 0)
                    even++;
                else {
                    odd++;
                }
                sum += input;
                count++;
                avg = (double)sum / count;
            }

        }
        System.out.println("The sum is: " + sum);
        System.out.println("how many numbers: " +count);
        System.out.println("Average: " +avg);
        System.out.println("Even: " +even);
        System.out.println("Odd: " +odd);
    }
}
