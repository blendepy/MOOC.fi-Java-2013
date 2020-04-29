public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(17, 58, 50);
      
        int i = 0;
        while (i < 200) {
            System.out.println(clock);
            clock.tick();
            i++;
        }
    }
}
