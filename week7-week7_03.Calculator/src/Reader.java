
import java.util.*;

public class Reader {

    private Scanner reader;

    public Reader() {
        this.reader = new Scanner(System.in);
    }

    public String readString(){
        String input = reader.nextLine();
        return input;
    }
    
    public int readInteger(){
        int input = Integer.parseInt(reader.nextLine());
        return input;
    }
}
