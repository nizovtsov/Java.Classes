import java.util.Arrays;

public class Book {
    private int id;
    private static int count = 0;
    private String title;
    private String[] authors;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private int price;
    private String typeOfBinding;

    public Book(String title, String[] authors, String publisher, int yearOfPublication, int numberOfPages, int price, String typeOfBinding) {
        setId(++count);
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Название='" + title + '\'' +
                ", Автор (ы)=" + Arrays.toString(authors) +
                ", Издательство='" + publisher + '\'' +
                ", Год издания=" + yearOfPublication +
                ", Количество страниц=" + numberOfPages +
                ", Цена=" + price +
                ", Тип переплета='" + typeOfBinding + '\'' +
                '}';
    }

}
