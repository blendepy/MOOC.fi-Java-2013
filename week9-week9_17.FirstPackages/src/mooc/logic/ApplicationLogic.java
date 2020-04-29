package mooc.logic;

import mooc.ui.*;

public class ApplicationLogic {
    private TextUserInterface a = new TextUserInterface();
    public ApplicationLogic(UserInterface ui) {
        
    }

    public void execute(int howManyTimes) {
        for (int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            a.update();
        }
    }
}
