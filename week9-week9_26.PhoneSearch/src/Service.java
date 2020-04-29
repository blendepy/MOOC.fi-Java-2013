
import java.util.*;

public class Service {

    private Map<String, Person> allPersons;

    public Service() {
        this.allPersons = new HashMap<String, Person>();
    }

    public void addNumber(String name, String number) {
        this.checkForExistingPerson(name);

        this.allPersons.get(name).addNumber(number);
    }

    public String searchForNumberUsingName(String name) {
        //if a person is not on the list print "not found"
        if (!this.allPersons.containsKey(name)) {
            return "  not found\n";
        }
        if (this.allPersons.get(name).getNumber().isEmpty()) {
            return "phone number not found";
        }
        //print existing person's numbers
        String number = "";
        for (String string : allPersons.get(name).getNumber()) {
            number += " " + string + "\n";
        }
        return number;
    }

    public String searchForNameUsingNumber(String number) {
        String foundName = "";
        
        for (String name : allPersons.keySet()) {
            if (allPersons.get(name).getNumber().contains(number)) {
                return name;
            }/* else {
                foundName = " not found";
            }*/
        }
        return " not found";
    }

    public void addAddress(String name, String street, String city) {
        this.checkForExistingPerson(name);

        this.allPersons.get(name).setAddress(street + " " + city);
    }

    public String viewAddress(String name) {

        return "  address: " + this.allPersons.get(name).getAddress();
    }

    public String viewAllInfo(String name) {
        if (!this.allPersons.containsKey(name)) {
            return "not found";
        }
        return this.viewAddress(name) + "\n" + "  phone numbers: \n" + this.searchForNumberUsingName(name);
    }

    public void deletePerson(String name) {
        this.allPersons.remove(name);
    }

    public Set<Person> searchByKeyword(String word) {
        Set<Person> list = new TreeSet<Person>();

        for (String key : allPersons.keySet()) {
            Person person = allPersons.get(key);
            if (person.getName().contains(word) || person.getAddress().contains(word)) {
                list.add(person);
            }
        }
        return list;
    }

    private void checkForExistingPerson(String name) {
        //if a person is not on the list
        //create a new person, then set his name
        if (!this.allPersons.containsKey(name)) {
            this.allPersons.put(name, new Person());
            this.allPersons.get(name).setName(name);
        }
    }

}
