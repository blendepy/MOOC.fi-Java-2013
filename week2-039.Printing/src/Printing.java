
public class Printing {

    public static void printStars(int amount) {
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int count = 0;
        while (count < sideSize) {
            printStars(sideSize);
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while (count < height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size){
            printStars(count);
            count++;

        }
    }

    public static void main(String[] args) {

        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(3);
        System.out.println("\n---");
        printRectangle(17, 3);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}
