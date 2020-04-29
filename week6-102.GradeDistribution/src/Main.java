import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grade classGrades = new Grade(reader);
        
        System.out.println("Type exam score, -1 completes: ");
        
        classGrades.enterScores(reader);
        classGrades.printGrades();

    }
}
