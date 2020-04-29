
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromCharacter, char toCharacter){
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }
    
    public String change(String characterString){
        String newChar ="";
        for (int i = 0; i < characterString.length(); i++) {
            char everyCharacterInWord = characterString.charAt(i);
            if(everyCharacterInWord == fromCharacter){
                newChar += toCharacter;
            } else{
                newChar += everyCharacterInWord;
            }
        }
        return newChar;
        //return characterString.replace(fromCharacter, toCharacter);
    }

}
