
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        
        while (true){
            System.out.print("Type a word: ");
            String input = reader.nextLine();
            list.add(input);
            
            if (input.equals("")){
                break;
            }
        }
        System.out.println("In alphabetical: ");
        Collections.sort(list);
        for (String i : list){
            System.out.println(i);
        }
    }
}
