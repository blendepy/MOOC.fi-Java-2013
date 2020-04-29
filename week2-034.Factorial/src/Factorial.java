import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int input = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int fact = 1;
        while (counter <= input){
            
            fact *= counter;
            counter++;
            
        }
        System.out.println("factorial  is: " +fact);

    }
}
