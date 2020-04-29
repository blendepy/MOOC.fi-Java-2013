import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int length = text.length() - 1;         //длинна слова (6символов)
        
        String reverse = "";                    //строка-собиратель
        while (length >= 0) {    
            char pickup  = text.charAt(length); //собираю символ начиная 
            reverse = reverse + pickup;         //добавляю каждый символ в строку
            length--;                           //считаю длинну слова от большего к меньшему
        }
        if (reverse.equals(text)){
            return true;
            
        }
 
       
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
