
import java.util.Scanner;

public class Grade {

    private int[] scoresList;

    public Grade(Scanner scanner) {
        this.scoresList = new int[6];
    }

    public void enterScores(Scanner scanner) {
        while (true) {
            int scores = Integer.parseInt(scanner.nextLine());

            if (scores == -1) {
                System.out.println("----");
                break;
            } else if (scores < -1) {

            } else if (scores < 30) {
                scoresList[5] += 1;
            } else if (scores >= 30 && scores < 35) {
                scoresList[4] += 1;
            } else if (scores >= 35 && scores < 40) {
                scoresList[3] += 1;
            } else if (scores >= 40 && scores < 45) {
                scoresList[2] += 1;
            } else if (scores >= 45 && scores < 50) {
                scoresList[1] += 1;
            } else if (scores >= 50 && scores <= 60) {
                scoresList[0] += 1;
            }
        }
    }

    public void printStar(int levelOfGrade) {
        int numberOfStars = scoresList[levelOfGrade];
        for (int i = 0; i < numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void printGrades() {                         //The point of this method is that it prints the numbers of grades by decrementing 'numberCount'
        int numberCount = 5;                            // and also it prints the stars using the for-loop variable 'i' as an index position for array
        System.out.println("Grade distribution:");
        for (int i = 0; i <= scoresList.length - 1; i++) {
            System.out.print(numberCount + ": ");       //printing from 5: to 0:
            printStar(i);                               //printing stars
            numberCount--;
        }
        System.out.print("Acceptance percentage: " + calculateAcceptance());
    }

    public double calculateAcceptance() {
        int totalNumberOfGrades = scoresList[5] + scoresList[4] + scoresList[3] + scoresList[2] + scoresList[1] + scoresList[0];
        int gradesThatNotPass = scoresList[5];
        int acceptedGrades = totalNumberOfGrades - gradesThatNotPass;

        double result = (double) acceptedGrades / totalNumberOfGrades * 100;
        
        return result;
    }
}
