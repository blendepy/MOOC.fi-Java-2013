import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a word: ");
        String input = reader.nextLine();
        System.out.print("What length: ");
        int number = Integer.parseInt(reader.nextLine());
        int length = input.length();
        int start = length - number;
        System.out.println("Result: " + input.substring(start, length));
    }
}
