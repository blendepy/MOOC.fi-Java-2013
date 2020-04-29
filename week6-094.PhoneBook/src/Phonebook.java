
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> persons;

    public Phonebook() {
        this.persons = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person human = new Person(name, number);
        persons.add(human);
    }

    public void printAll() {
        for (Person count : persons) {
            System.out.println(count);
        }
    }

    public String searchNumber(String name) {
        String a = "";
        for (Person count : persons) {
            a += count;
            if (a.contains(name)) {
                return count.getNumber();
            }
        }
        return "number not known";
    }
}
