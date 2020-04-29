
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int summ = 0;
        for (Integer a : list) {
            summ += a;
        }
        return summ;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum = sum(list);
        double avg = sum / list.size();
        return avg;
    }

    public static double variance(ArrayList<Integer> list) {
        double avg = average(list);
        double sumVar = 0.0;
        int count = 0;
        
        for (Integer d : list){
          double plus = d - avg;
          double squares = plus*plus;
          sumVar = sumVar + squares;
          count++;
        }
        double result = (sumVar / (count - 1)*1.0);
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
