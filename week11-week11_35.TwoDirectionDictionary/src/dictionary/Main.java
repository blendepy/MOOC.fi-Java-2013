package dictionary;

public class Main {
    public static void main(String[] args) {

        MindfulDictionary dict = new MindfulDictionary("src/words_1.txt");
dict.load();

System.out.println( dict.translate("apina") );
System.out.println( dict.translate("ohjelmointi") );
System.out.println( dict.translate("alla oleva") );
dict.add("test", "ttt");
dict.add("ttt", "test");
dict.save();
    }
}
