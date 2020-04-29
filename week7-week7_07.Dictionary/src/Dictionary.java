
import java.util.*;

public class Dictionary {

    private HashMap<String, String> list = new HashMap<String, String>();

    public void add(String word, String translation) {
        this.list.put(word, translation);
    }

    public String translate(String word) {
        return this.list.get(word);
    }

    public int amountOfWords() {
        return this.list.size();
    }

    public ArrayList<String> translationList() {

        ArrayList<String> arrayList = new ArrayList<String>();
        String wordAndTranslated = "";

        for (String key : list.keySet()) {
            wordAndTranslated = key + " = " + list.get(key);
            arrayList.add(wordAndTranslated);
        }
        return arrayList;
    }
}
