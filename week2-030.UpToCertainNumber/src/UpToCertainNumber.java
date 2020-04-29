
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int b = Integer.parseInt(reader.nextLine());
        int a = 1;
        while (a <= b){
            System.out.println(a);
            a++;
        }
        
    }
}
