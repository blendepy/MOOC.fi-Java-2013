
import java.io.*;
import java.util.*;

public class Printer {

    private String fileName;
    private File file;

    public Printer(String fileName) {
        this.fileName = fileName;
        file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            String lineForWords = scanner.nextLine();
            if (lineForWords.contains(word)) {
                System.out.println(lineForWords);
            }
            if (word.isEmpty()) {
                while (scanner.hasNextLine()) {
                    String lineForAllText = scanner.nextLine();
                    System.out.println(lineForAllText);
                }
            }
        }
    }
}
