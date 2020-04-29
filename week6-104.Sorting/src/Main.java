
public class Main {

    public static void main(String[] args) {

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int count = 0; count < array.length; count++) {
            if (smallest > array[count]) {
                smallest = array[count];
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestNumber = array[0];
        int indexNumber = 0;

        for (int count = 0; count < array.length; count++) {
            if (smallestNumber > array[count]) {
                smallestNumber = array[count];
                indexNumber = count;
            }
        }
        return indexNumber;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestNumber = array[index];
        int indexNumber = index;

        for (int count = indexNumber; count < array.length; count++) {
            if (smallestNumber > array[count]) {
                smallestNumber = array[count];
                indexNumber = count;
            }
        }
        return indexNumber;
    }

    public static void swap(int[] array, int index1, int index2) {
        int firstIndexToSwap = array[index1];
        int secondIndexToSwap = array[index2];

        array[index1] = secondIndexToSwap;
        array[index2] = firstIndexToSwap;
    }

    public static void sort(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        for (int count = 0; count < array.length-1; count++) {
            int index = indexOfTheSmallestStartingFrom(array, count);
            swap(array, count, index);

            System.out.println("");
            System.out.print("[ ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("]");
        }
    }
}
