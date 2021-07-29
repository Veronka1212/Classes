package by.epam.prog_with_class.task10;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Input i = new Input();
        Logic l = new Logic();

        ArrayList<Airline> airlines = new ArrayList<>();
        airlines.add(new Airline("Москва", 456, "ТУ-134", 1345, "пятница"));
        airlines.add(new Airline("Питер", 423, "боинг", 1005, "суббота"));
        airlines.add(new Airline("Берлин", 233, "СухойСуперджет", 2345, "пятница"));
        airlines.add(new Airline("Париж", 476, "грузовой", 1300, "понедельник"));
        airlines.add(new Airline("Анталия", 987, "чартер", 1830, "среда"));
        airlines.add(new Airline("Берлин", 733, "чартер", 2050, "пятница"));
        airlines.add(new Airline("Москва", 167, "боинг", 1020, "вторник"));

        System.out.println("Что будем делать? \n" +
                "1 список рейсов для заданного пункта назначения; \n" +
                "2 список рейсов для заданного дня недели; \n" +
                "3 список рейсов для заданного дня недели, время вылета для которых больше заданного.");

        int x = i.UserInput();

        switch (x) {
            case 1: {
                System.out.println("Введите пункт назначения");
                String n = i.input();
                l.outputForaGivenDestination(airlines,n);
                break;
            }
            case 2: {
                System.out.println("Введите день недели");
                String n = i.input();
                l.outputForaGivenDay(airlines,n);
                break;
            }
            case 3: {
                System.out.println("Введите день недели");
                String n = i.input();
                System.out.println("Введите время в формате hhmm");
                int time=i.InputTime();
                l.outputForaGivenDayAndTime(airlines,n,time);
                break;
            }
        }
    }
}
