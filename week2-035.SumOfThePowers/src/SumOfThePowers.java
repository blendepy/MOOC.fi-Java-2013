
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        int counter = 0;
        int result = 0;
        
        while (counter <= input){
            int math = (int)Math.pow(2, counter);
            result += math;
            counter++;
            
        }
        System.out.println("factorial  is: " +result);

    }
}
