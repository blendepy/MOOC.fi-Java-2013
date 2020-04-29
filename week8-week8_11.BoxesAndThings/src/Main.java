
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        Box box2 = new Box(10);
        box2.add(new Book("Kent Beck", "Test Driven Development", 7.7));

        ToBeStored test = new Box(20);
        Box newTest = (Box) test;

        newTest.add(box);
        newTest.add(box2);

        System.out.println(box);
        System.out.println("====");
        System.out.println(newTest);
    }
}
