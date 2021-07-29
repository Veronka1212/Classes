package by.epam.prog_with_class.task9;

public class Book {

    public Book() {

    }

    public Book(int id, String title, String author, String publishingНouse, int year, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingНouse = publishingНouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingНouse() {
        return publishingНouse;
    }

    public void setPublishingНouse(String publishingНouse) {
        this.publishingНouse = publishingНouse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Logic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingНouse='" + publishingНouse + '\'' +
                ", year=" + year +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    private int id;
    private String title;
    private String author;
    private String publishingНouse;
    private int year;
    private int numberOfPages;
    private int price;
    private String bindingType;

}
