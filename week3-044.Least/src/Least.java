
public class Least {

    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        //return Math.min(number1, number2);
        if (number1 > number2){
            return number2;
        }else 
            return number1;

    }

    public static void main(String[] args) {
        int result = least(2, 7);
        System.out.println("Least: " + result);
    }
}
