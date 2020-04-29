package dictionary;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MindfulDictionary {

    private Map<String, String> dictionary;
    private String file;

    public MindfulDictionary(String file) {
        this.dictionary = new HashMap<String, String>();
        this.file = file;
    }

    public MindfulDictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    public void add(String word, String translation) {
        dictionary.putIfAbsent(word, translation);
    }

    public String translate(String word) {
        if (dictionary.containsValue(word)) {
            return this.returnKey(word);
        }
        return dictionary.get(word);
    }

    public void remove(String word) {
        if (dictionary.containsValue(word)) {
            dictionary.remove(this.returnKey(word));
        }
        dictionary.remove(word);
    }

    public boolean load() {
        Scanner reader = null;
        try {
            reader = new Scanner(new File(file));
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] splitWord = line.split(":");
                for (int i = 0; i < splitWord.length - 1; i++) {
                    dictionary.put(splitWord[i], splitWord[i + 1]);
                }
            }
        } catch (FileNotFoundException ex) {
            reader.close();
            return false;
        }
        return true;
    }

    public boolean save() {
        try {
            FileWriter writer = new FileWriter(file);
            Set<String> listOfKeys = new HashSet<String>(dictionary.keySet());

            for (String string : listOfKeys) {
                writer.write(string + ":" + dictionary.get(string) + "\n");
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;
    }

    private String returnKey(String word) {
        Set<String> listOfKeys = new HashSet<String>(dictionary.keySet());
        String key = "";

        for (String count : listOfKeys) {
            if (dictionary.get(count).equalsIgnoreCase(word)) {
                key = count;
            }
        }
        return key;
    }
}
