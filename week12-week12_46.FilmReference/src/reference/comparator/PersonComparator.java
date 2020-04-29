package reference.comparator;

import java.util.Comparator;
import java.util.Map;
import reference.domain.Person;

public class PersonComparator implements Comparator<Person> {

    private Map<Person, Integer> peopleIds;

    public PersonComparator(Map<Person, Integer> peopleIds) {
        this.peopleIds = peopleIds;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return peopleIds.get(o2).compareTo(peopleIds.get(o1));
    }
}
