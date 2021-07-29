package by.epam.prog_with_class.task4;

import java.util.ArrayList;

public class Logic {

    public ArrayList<Train> sortingByNumbers(ArrayList<Train> array) {
        boolean flag = true;
        Train buffer;

        while (flag) {

            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).getNumber() > array.get(i + 1).getNumber()) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
                flag = false;
            }
        }
        return array;
    }

    public ArrayList<Train> sortingByTime(ArrayList<Train> array) {
        boolean flag = true;
        Train buffer;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if ((array.get(i).getDestination().codePointAt(0) == array.get(i + 1).getDestination().codePointAt(0)) & (array.get(i).getNumber() < array.get(i + 1).getNumber())) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
        return array;
    }

    public ArrayList<Train> sortByDestination(ArrayList<Train> array) {
        boolean flag = true;
        Train buffer;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).getDestination().codePointAt(0) > array.get(i + 1).getDestination().codePointAt(0)) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
        return array;
    }
}

