
public class Main {

    public static void main(String[] args) {
        Counter a = new Counter(2, false);
        a.decrease(15);
        a.decrease();
        a.decrease();
        a.decrease();
        System.out.println(a.value());
    }
}
