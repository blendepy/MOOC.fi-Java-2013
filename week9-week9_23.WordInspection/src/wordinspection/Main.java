package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // test your code here

        File file = new File("src/shortList.txt");
        WordInspection insp = new WordInspection(file);
        //System.out.println(insp.reverse("213"));

    }
}
