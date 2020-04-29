
import java.util.*;

public class Person implements Comparable<Person> {

    private String name;
    private List<String> numbers;
    private String address = "address unknown";

    public Person() {
        this.numbers = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumber() {
        return numbers;
    }

    public void addNumber(String number) {
        if (!this.numbers.contains(number)) {
            this.numbers.add(number);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(address.length() > 0 ? "  address: " + address : "  address unknown");
        sb.append("\n");

        if (numbers.size() > 0) {
            sb.append("  phone numbers:\n");
            for (String phoneNumber : numbers) {
                sb.append("   " + phoneNumber);
                sb.append("\n");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }
}
