
import java.util.Random;

public class PasswordRandomizer {

    private Random random;
    private int length;
    // Define the variables

    public PasswordRandomizer(int length) {
        random = new Random();
        this.length = length;
        // Initialize the variable
    }

    public String createPassword() {
        String newpw = "";
        
        for (int i = 0; i < this.length; i++) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(25));
            newpw +=symbol;
        }
        return "" + newpw;
    }
}
