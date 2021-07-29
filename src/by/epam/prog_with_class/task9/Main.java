package by.epam.prog_with_class.task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Input i = new Input();
        Logic l = new Logic();

        ArrayList<Book> book = new ArrayList<>();
        book.add(new Book(567, "Война и мир", "Толстой", "Эксмо", 1980, 400, 20, "твёрдый"));
        book.add(new Book(354, "1984", "Оруэлл", "Мир", 2005, 300, 15, "твёрдый"));
        book.add(new Book(987, "Улисс", "Джойс", "Эксмо", 2010, 450, 25, "мягкий"));
        book.add(new Book(234, "Лолита", "Набоков", "Москва", 1986, 230, 28, "мягкий"));
        book.add(new Book(126, "Звук и ярость", "Фолкнер", "Минск", 1998, 600, 12, "мягкий"));
        book.add(new Book(890, "Человек-невидимка", "Эллисон", "Эксмо", 2009, 330, 20, "твёрдый"));
        book.add(new Book(387, "На маяк", "Вулф", "Мир", 2020, 280, 16, "твёрдый"));
        book.add(new Book(890, "Иллиада и Одессея", "Гомер", "Харвест", 2010, 500, 27, "твёрдый"));

        System.out.println("Что будем делать?\n" +
                "1 - список книг заданного автора; \n" +
                "2 - список книг, выпущенных заданным издательством; \n" +
                "3 - список книг, выпущенных после заданного года.\n");

        int x = i.UserInput();

        switch (x) {
            case 1: {
                System.out.println("Введите автора");
                String n = i.input();
                l.outputForaGivenAuthor(book, n);
                break;
            }
            case 2: {
                System.out.println("Введите издательство");
                String n = i.input();
                l.outputForaGivenPublishing(book, n);
                break;
            }
            case 3: {
                System.out.println("Введите год");
                int n = i.InputYear();
                l.outputForaGivenYear(book, n);
                break;
            }
        }
    }
}
