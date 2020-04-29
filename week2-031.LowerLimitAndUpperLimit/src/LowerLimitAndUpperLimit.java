
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int b = Integer.parseInt(reader.nextLine());

        while (a <= b) {
            System.out.println(a);
            a++;
            if (a > b) {
                
            }
        }
    }
}
