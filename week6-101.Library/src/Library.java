
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> allBooks;

    public Library() {
        this.allBooks = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.allBooks.add(newBook);
    }

    public void printBooks() {
        for (Book count : this.allBooks) {
            System.out.println(count);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book count : this.allBooks) {
            if (StringUtils.included(count.title(), title)) {
                found.add(count);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book count : this.allBooks) {
            if (StringUtils.included(count.publisher(), publisher)) {
                found.add(count);
            }
        }
        return found;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for (Book count : this.allBooks) {
            if (count.year() == (year)) {
                found.add(count);
            }
        }
        return found;
    }
}
