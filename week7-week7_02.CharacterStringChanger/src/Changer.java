
import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> listOfChanges;

    public Changer() {
        this.listOfChanges = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        listOfChanges.add(change);
    }
    
    public String change(String characterString){
        String newWord = characterString;
        for(Change a : listOfChanges){
            newWord = a.change(newWord);
        }
        return newWord;
    }

}
