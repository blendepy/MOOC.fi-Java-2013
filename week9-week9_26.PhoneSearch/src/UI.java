
import java.util.Scanner;
import java.util.Set;

public class UI {

    private Scanner reader = new Scanner(System.in);
    private Service test = new Service();

    public UI() {
    }

    public void Menu() {
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");
    }

    public void start() {
        Menu();
        String input = "";
        while (!input.equals("x")) {
            System.out.println("");
            System.out.print("command: ");
            input = reader.nextLine();

            if (input.equals("1")) {
                System.out.print("whose number: ");
                String addname = reader.nextLine();
                System.out.print("number: ");
                String addnum = reader.nextLine();
                test.addNumber(addname, addnum);
            }
            if (input.equals("2")) {
                System.out.print("whose number: ");
                String name = reader.nextLine();
                System.out.print(test.searchForNumberUsingName(name));
            }
            if (input.equals("3")) {
                System.out.print("number: ");
                String num = reader.nextLine();
                System.out.print(test.searchForNameUsingNumber(num));
            }
            if (input.equals("4")) {
                System.out.print("whose address: ");
                String addname = reader.nextLine();
                System.out.print("street: ");
                String addstr = reader.nextLine();
                System.out.print("city: ");
                String city = reader.nextLine();
                test.addAddress(addname, addstr, city);
            }
            if (input.equals("5")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                System.out.print(test.viewAllInfo(name));
            }
            if (input.equals("6")) {
                System.out.print("whose information: ");
                String name = reader.nextLine();
                test.deletePerson(name);
            }
            if (input.equals("7")) {
                System.out.print("keyword (if empty, all listed): ");
                String name = reader.nextLine();

                Set<Person> contacts = test.searchByKeyword(name);

                if (contacts.size() > 0) {
                    int i = 1;
                    for (Person contact : contacts) {
                        System.out.println("  " + contact.getName());
                        System.out.println(contact);
                        if (i < contacts.size()) {
                            System.out.println();
                        }
                        i++;
                    }
                } else {
                    System.out.println("  keyword not found");
                }
            }
        }
    }
}
