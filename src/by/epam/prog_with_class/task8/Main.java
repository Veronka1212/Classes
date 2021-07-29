package by.epam.prog_with_class.task8;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Logic l = new Logic();
        Input i = new Input();
        final long START_INTERVAL = 2000000L;
        final long END_INTERVAL = 7000000L;

        ArrayList<Customer> customer = new ArrayList<>();
        customer.add(new Customer(123, "Иванов", "Иван", "Иванович", "Пушкина 266 91", 8396543, 3882320));
        customer.add(new Customer(453, "Есенин", "Петр", "Петрович", "Советская 26 91", 4789012, 9846327));
        customer.add(new Customer(874, "Сидоров", "Александр", "Ильич", "Гая 120 43", 3789465, 3765289));
        customer.add(new Customer(305, "Есенин", "Роман", "Андреевич", "Минская 110 9", 2890364, 1983647));
        customer.add(new Customer(280, "Лось", "Сергей", "Сергеевич", "Кирова 2 34", 8745210, 3778651));
        customer.add(new Customer(190, "Лось", "Сергей", "Петрович", "Крылова 45 3", 3754628, 3219006));

        System.out.println("Что будем делать?\n" +
                "1 - список покупателей в алфавитном порядке;\n" +
                "2 - список покупателей, у которых номер кредитной карточки находится в заданном интервале");

        int x = i.UserInput();

        switch (x) {
            case 1: {
                customer = l.sortBySecondname(customer);
                customer = l.sortByName(customer);
                customer = l.sortByPatronymic(customer);
                for (Customer c : customer) {
                    System.out.println(c.toString());
                }
                break;
            }
            case 2: {
                l.creditCardNumber(START_INTERVAL, END_INTERVAL, customer);
                break;
            }
        }
    }
}
