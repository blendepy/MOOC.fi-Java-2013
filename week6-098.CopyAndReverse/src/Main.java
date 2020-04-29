
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        int[] otherArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            otherArray[i] = array[i];
        }
        return otherArray;
    }

    public static int[] reverseCopy(int[] array) {
        int[] otherArray = new int[array.length];
        int helper = array.length;                  //перменная-помощник из длинны массива

        for (int i = 0; i <= array.length - 1; i++) {   //array.length-1 - последний индекс массива
            helper--;
            otherArray[helper] = array[i];          //перебор с нулевой позиции array в otherArray с последней к начальной
        }
        return otherArray;
    }
}
