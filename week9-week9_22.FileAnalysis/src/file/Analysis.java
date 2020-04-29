package file;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Analysis {

    private List<String> lines;

    public Analysis(File file) {

        Scanner reader = null;
        try {
            reader = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Analysis.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.lines = new ArrayList<String>();

        while (reader.hasNextLine()) {
            lines.add(reader.nextLine());
        }
    }

    public int lines() {
        int count = 0;
        for (String string : lines) {
            count++;
        }
        return count;
    }

    public int characters() {
        int count = 0;
        for (String string : lines) {
            count += string.length() + 1;
        }
        return count;
    }
}
