
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("first ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("second ");
        int second = Integer.parseInt(reader.nextLine());
        //int counter = first;
        int sum = 0;
        while (first <= second){
            
            sum += first;
            first++;
            
        }
        System.out.println("sum is: " +sum);
        
    }
}
