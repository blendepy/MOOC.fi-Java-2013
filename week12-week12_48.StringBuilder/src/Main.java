
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append("\n").append(" ");
        for (int i = 0; i < t.length; i++) {
            sb.append(t[i]);
            if (i != t.length - 1) {
                sb.append(", ");
            }
            if (i % 4 == 3 && t.length > 4) {
                sb.append("\n").append(" ");
            }
        }
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
