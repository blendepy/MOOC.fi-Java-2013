package wordinspection;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WordInspection {

    private List<String> words;

    public WordInspection(File file) {
        Scanner reader = null;
        try {
            reader = new Scanner(file, "UTF-8");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordInspection.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.words = new ArrayList<String>();
        while (reader.hasNextLine()) {
            this.words.add(reader.nextLine());
        }
    }

    public int wordCount() {
        return words.size();
    }

    public List<String> wordsContainingZ() {
        List<String> wordsWithZ = new ArrayList<String>();
        for (String string : words) {
            if (string.contains("z") || string.contains("Z")) {
                wordsWithZ.add(string);
            }
        }
        return wordsWithZ;
    }

    public List<String> wordsEndingInL() {
        List<String> wordsEndingInL = new ArrayList<String>();
        for (String string : words) {
            if (string.endsWith("l") || string.endsWith("L")) {
                wordsEndingInL.add(string);
            }
        }
        return wordsEndingInL;
    }

    public List<String> palindromes() {
        List<String> palindromes = new ArrayList<String>();

        for (String string : words) {
            if (string.equals(this.reverse(string))) {
                palindromes.add(string);
            }
        }
        return palindromes;
    }

    public List<String> wordsWhichContainAllVowels() {
        List<String> list = new ArrayList<String>();

        for (String string : words) {
            if (string.contains("a") && string.contains("e") && string.contains("i") &&
                string.contains("o") && string.contains("u") && string.contains("y") &&
                string.contains("ä") && string.contains("ö")) {
                
                list.add(string);
            }
        }
        return list;
    }

    private String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i > -1; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }
}
