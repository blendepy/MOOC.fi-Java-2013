public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int count = 0;
        while (count < amount) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        int count = 0;
        while (count < amount) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        while (count <= size){
        printWhitespaces(size - count);
        printStars(count);
        count++;
        }
    }

    public static void xmasTree(int height) {
        int count = 0;
        int space = (height) - 1;
        int star = 1;
        while (count < height){
            printWhitespaces(space);
            printStars(star);
            space--;
            star = star + 2;
            count++;    
        }
        for (int i=0; i < 2;i++){
            
            printWhitespaces((height)-2);
            printStars(3);
        }
        
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        //xmasTree(10);
    }
}
