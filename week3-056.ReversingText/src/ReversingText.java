
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        
        int length = text.length() - 1;         //длинна слова (6символов)
        
        String reverse = "";                    //строка-собиратель
        while (length >= 0) {    
            
            char pickup  = text.charAt(length); //собираю символ начиная 
                                                //с последнего шестого, потом пятый и т.д.
            
            reverse = reverse + pickup;         //добавляю каждый символ в строку
            
            length--;                           //считаю длинну слова от большего к меньшему
        }

        return reverse;                         //возвращаю строку с перевернутым словом
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
