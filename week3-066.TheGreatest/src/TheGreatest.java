
import java.util.ArrayList;

public class TheGreatest {

    public static int greatest(ArrayList<Integer> list) {
        int greatest = 0;
        int count = 0;
        for (int num : list) {
            if (num > 0 && count == 0) {
                greatest = num;
            } else if (num > greatest) {
                greatest = num;
            } else if (num < 0 && count ==0){
                greatest = num;
            } else if (num > greatest)
                greatest = num;
            count++;
        }
        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(-2);
        lista.add(-1);
        lista.add(-3);
        //lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
