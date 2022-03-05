import java.util.ArrayList;
import java.util.List;

public class BooksList {
    private List<Book> booksList = new ArrayList<>();

    public void addBook(Book book) {
        booksList.add(book);
    }

    public void printAllBooks() {
        for (Book book : booksList) {
            System.out.println(book.toString());
        }
    }

    public void printAuthorBooks(String author) {
        System.out.println("Список книг автора - " + author);
        for (Book book : booksList) {
            for (String authors : book.getAuthors()) {
                if (authors.equals(author)) {
                    System.out.println(book.toString());
                }
            }
        }
    }

    public void printPublisherBooks(String publisher) {
        System.out.println("Список книг выпущенных издательством - " + publisher);
        for (Book book : booksList) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    public void printBooksReleasedAfterYear(int year) {
        System.out.println("Список книг выпущенных после " + year + " года");
        for (Book book : booksList) {
            if (book.getYearOfPublication() > year) {
                System.out.println(book.toString());
            }
        }
    }
}
