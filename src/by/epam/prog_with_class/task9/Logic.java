package by.epam.prog_with_class.task9;

import java.util.ArrayList;

public class Logic {

    public void outputForaGivenAuthor(ArrayList<Book> array, String author) {
        int flag = 0;
        for (Book b : array) {
            if (b.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Книг такого автора не найдено");
        }
    }

    public void outputForaGivenPublishing(ArrayList<Book> array, String publishing) {
        int flag = 0;
        for (Book b : array) {
            if (b.getPublishingНouse().equalsIgnoreCase(publishing)) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Книг такого издательства не найдено");
        }
    }

    public void outputForaGivenYear(ArrayList<Book> array, int n) {
        int flag = 0;
        for (Book b : array) {
            if (b.getYear() > n) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Книг после данного года не найдено");
        }
    }
}
