
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word.isEmpty() || searched.isEmpty()) {
            return false;
        }
        word = word.trim();
        word = word.toUpperCase();
        searched = searched.trim();
        searched = searched.toUpperCase();

        if (word.contains(searched)) {
            return true;
        } else {
            return false;
        }
    }
}
