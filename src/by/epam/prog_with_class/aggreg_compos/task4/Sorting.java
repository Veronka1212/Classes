package by.epam.prog_with_class.aggreg_compos.task4;

import java.util.Comparator;

public class Sorting implements Comparator<Account>{

    @Override
    public int compare(Account o1, Account o2) {
        return (int) (o1.getNumber() - o2.getNumber());
    }
}
