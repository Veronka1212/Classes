package by.epam.prog_with_class.task8;

import java.util.ArrayList;

public class Logic {

    public ArrayList<Customer> sortBySecondname(ArrayList<Customer> array) {
        boolean flag = true;
        Customer buffer;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i).getSecondName().codePointAt(0) > array.get(i + 1).getSecondName().codePointAt(0)) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
        return array;
    }

    public ArrayList<Customer> sortByName(ArrayList<Customer> array) {
        boolean flag = true;
        Customer buffer;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if ((array.get(i).getSecondName().codePointAt(0) == array.get(i + 1).getSecondName().codePointAt(0)) &
                        (array.get(i).getName().codePointAt(0) > array.get(i + 1).getName().codePointAt(0))) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
        return array;
    }

    public ArrayList<Customer> sortByPatronymic(ArrayList<Customer> array) {
        boolean flag = true;
        Customer buffer;

        while (flag) {
            flag = false;
            for (int i = 0; i < array.size() - 1; i++) {
                if ((array.get(i).getSecondName().codePointAt(0) == array.get(i + 1).getSecondName().codePointAt(0)) &
                        (array.get(i).getName().codePointAt(0) == array.get(i + 1).getName().codePointAt(0)) &
                        (array.get(i).getPatronymic().codePointAt(0) > array.get(i + 1).getPatronymic().codePointAt(0))) {
                    flag = true;
                    buffer = array.get(i + 1);
                    array.set(i + 1, array.get(i));
                    array.set(i, buffer);
                }
            }
        }
        return array;
    }

    public void creditCardNumber (long a,long b,ArrayList<Customer> array){
        for (Customer c : array) {
            if (c.сreditCardNumber>a & c.сreditCardNumber<b) {
                System.out.println(c.toString());
            }
        }
    }
}
