package by.epam.prog_with_class.aggreg_compos.task4;

import java.util.ArrayList;

public class Logic {

    public void accountBlock(ArrayList<Account> arrayList, long n) {
        for (Account a : arrayList) {
            if (a.getNumber().equals(n)) {
                a.setBlock(true);
                System.out.println("Ваш счет заблокирован");
            }
        }
    }

    public void accountUnblock(ArrayList<Account> arrayList, long n) {
        for (Account a : arrayList) {
            if (a.getNumber().equals(n)) {
                a.setBlock(false);
                System.out.println("Ваш счет разблокирован");
            }
        }
    }

    public void searchAccount(ArrayList<Account> array, Long account) {
        int flag = 0;
        System.out.println("Найденные счета:");
        for (Account a : array) {
            if (a.getNumber().equals(account)) {
                flag++;
                System.out.println(a.toString());
            }
        }
        if (flag == 0) System.out.println("счетов не найдено");
    }

    public void searchAccount(ArrayList<Account> array, String name) {
        int flag = 0;
        System.out.println("Найденные счета:");
        for (Account a : array) {
            if (a.getClient().equalsIgnoreCase(name)) {
                flag++;
                System.out.println(a.toString());
            }
        }
        if (flag == 0) System.out.println("счетов не найдено");
    }

    public double accountSumm(ArrayList<Account> array) {
        double positiveSum = 0;
        for (Account a : array) {
            if (a.getAmount() > 0) {
                positiveSum = positiveSum + a.getAmount();
            }
        }
        return positiveSum;
    }

    public double accountSummNegative(ArrayList<Account> array) {
        double negativeSum = 0;
        for (Account a : array) {
            if (a.getAmount() > 0) {
                negativeSum = negativeSum + a.getAmount();
            }
        }
        return negativeSum;
    }
}

