package by.epam.prog_with_class.aggreg_compos.task5;

import java.util.Comparator;

public class Sorting1 implements Comparator<Tour> {

    @Override
    public int compare(Tour o1, Tour o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
