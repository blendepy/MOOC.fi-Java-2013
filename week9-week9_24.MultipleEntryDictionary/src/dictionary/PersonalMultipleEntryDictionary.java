package dictionary;

import java.util.*;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> list;

    public PersonalMultipleEntryDictionary() {
        this.list = new HashMap<String, Set<String>>();
    }

    @Override
    public void add(String word, String entry) {
        if (!this.list.containsKey(word)) {
            this.list.put(word, new HashSet<String>());
        }
        this.list.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.list.get(word);
    }

    @Override
    public void remove(String word) {
        this.list.remove(word);
    }

}
