package tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private Set<String> list = new HashSet< String>();
    private int count = 0;

    @Override
    public void add(String characterString) {
        if (this.list.contains(characterString)) {
            count++;
        }
        this.list.add(characterString);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.count;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.list;
    }

    @Override
    public void empty() {
        this.list.clear();
        this.count = 0;
    }

}
