package by.epam.prog_with_class.aggreg_compos.task5;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {

    Scanner scan = new Scanner(System.in);

    public int UserInput() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number >= 1 & number <= 5) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите 1 - 5");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }

    public int UserInput2() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number >= 1 & number <= 3) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите 1 - 3");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }

    public int UserInput3() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number >= 0) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите кол-во дней");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }
}
