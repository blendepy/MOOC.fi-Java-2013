
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Arto");
        System.out.println("");
        printWithSmileys("Matti");
        System.out.println("");
        printWithSmileys("Mikael");
    }

    private static void printWithSmileys(String charString) {
        String smiley = ":)";
        int wordLength = charString.length();

        if (wordLength < 6) {
            wordLength += 1;
        }

        for (int i = 0; i < wordLength; i++) {
            System.out.print(smiley);
        }

        System.out.println("");

        if (charString.length() % 2 == 0) {
            System.out.println(":) " + charString + " :)");
        } else {
            System.out.println(":) " + charString + "  :)");
        }

        for (int i = 0; i < wordLength; i++) {
            System.out.print(smiley);
        }

    }
}
