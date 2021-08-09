package by.epam.prog_with_class.aggreg_compos.task4;

import java.util.Comparator;

public class SortingAlphabet  implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getClient().charAt(0) - o2.getClient().charAt(0);
    }
}
