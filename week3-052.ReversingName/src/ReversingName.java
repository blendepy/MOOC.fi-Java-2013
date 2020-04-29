import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        System.out.print("reverse: " + reverse(name));
        
        
    } 

    public static String reverse(String name) {
        int length = name.length();
        int i = 0;
        String help = "";
        String litera = "";
        while (i < length) {
            litera = name.substring(length - i - 1, length - i);
            help = help + litera;
            i++;
        }
         return help;
    }


}

    

