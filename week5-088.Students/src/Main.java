
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Student> listOfStudents = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String studentName = userInput.nextLine();
            if (studentName.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = userInput.nextLine();

            listOfStudents.add(new Student(studentName, studentNumber));
        }

        System.out.println("");

        for (Student list : listOfStudents) {
            System.out.println(list);
        }

        System.out.println("");

        System.out.print("Give search term: ");
        String search = userInput.nextLine();

        System.out.println("Result: ");
        for (Student list : listOfStudents) {
            if (list.getName().contains(search)) {
                System.out.println(list);
            }
        }
    }
}
