public class Main {
    public static void main(String[] args) {
        CivilService a = new CivilService();
        a.getDaysLeft();
        System.out.println(a);
        a.work();
        a.work();
        a.work();
        a.getDaysLeft();
        System.out.println(a);
    }
}
