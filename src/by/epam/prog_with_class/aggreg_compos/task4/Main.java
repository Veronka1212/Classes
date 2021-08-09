package by.epam.prog_with_class.aggreg_compos.task4;

//. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки 
//счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по 
//всем счетам, имеющим положительный и отрицательный балансы отдельно.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Logic l = new Logic();
        Input i = new Input();
        Scanner scan = new Scanner(System.in);
        ArrayList<Account> listOfAccounts = new ArrayList<>();
        listOfAccounts.add(new Account(655876L, "Иванов", 4500, false));
        listOfAccounts.add(new Account(654454L, "Петров", 1200, false));
        listOfAccounts.add(new Account(123234L, "Иванов", 0, false));
        listOfAccounts.add(new Account(654111L, "Сидоров", 4300, true));
        listOfAccounts.add(new Account(554233L, "Сидоров", -500, false));
        listOfAccounts.add(new Account(134356L, "Пушкин", 60000, false));
        listOfAccounts.add(new Account(767635L, "Лермонтов", 4789, false));
        listOfAccounts.add(new Account(324500L, "Брежнев", 10500, false));

        System.out.println("Введите номер счета или фамилию клиента дял поиска: ");
        if (scan.hasNextLong()) {
            l.searchAccount(listOfAccounts, scan.nextLong());
        } else {
            l.searchAccount(listOfAccounts, scan.nextLine());
        }

        System.out.println("Что будем делать?\n" +
                "1 - сортировка счетов по возрастанию\n" +
                "2 - сортировка по алфавиту\n" +
                "3 - вывод суммы положительных счетов\n" +
                "4 - вывод суммы отрицательных счетов\n" +
                "5 - заблокировать счет по номеру счета\n" +
                "6 - разблокировать счет по номеру счета");
        int x = i.UserInput();

        switch (x) {
            case 1: {
                Comparator<Account> sortN = new Sorting();
                listOfAccounts.sort(sortN);
                for (Account a : listOfAccounts)
                    System.out.println(a.toString());
                break;
            }
            case 2: {
                Comparator<Account> sortA = new SortingAlphabet();
                listOfAccounts.sort(sortA);
                for (Account a : listOfAccounts)
                    System.out.println(a.toString());
                break;
            }
            case 3: {
                System.out.println(l.accountSumm(listOfAccounts));
                break;
            }
            case 4: {
                System.out.println(l.accountSummNegative(listOfAccounts));
                break;
            }
            case 5: {
                System.out.println("Введите номер счета");
                if (scan.hasNextLong()) {
                    l.accountBlock(listOfAccounts, scan.nextLong());
                } else System.out.println("Такого счета не существует");
                break;
            }
            case 6: {
                System.out.println("Введите номер счета");
                if (scan.hasNextLong()) {
                    l.accountUnblock(listOfAccounts, scan.nextLong());
                } else System.out.println("Такого счета не существует");
                break;
            }
        }
    }
}


