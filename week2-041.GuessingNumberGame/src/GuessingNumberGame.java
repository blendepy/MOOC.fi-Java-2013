
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        boolean x = true;
        int count = 1;
        while (x && count < 10) {
            System.out.print("Guess a number: ");
            
            int uInput = Integer.parseInt(reader.nextLine());
            
            
            if (uInput > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + count);
            } else if (uInput < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + count);
            } else {
                System.out.println("Congratulations, your number is correct!");
            }
            
            if (uInput == numberDrawn) {
                x = false;

            }
            count++;
        }

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
