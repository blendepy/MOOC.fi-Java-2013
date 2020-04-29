
public class Main {

    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {

        for (int count = 0; count < 100; count++) {

            Thing brick = new Thing("Brick", count + 1);
            Suitcase testCase = new Suitcase(100);

            testCase.addThing(brick);
            container.addSuitcase(testCase);
        }
    }
}
