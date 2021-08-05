package by.epam.prog_with_class.aggreg_compos.task2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {

    Scanner scan = new Scanner(System.in);

    public int input() {
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

    public int inputWheelSize() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number >= 5 & number <= 63) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите 5 - 63");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }

    public int inputNumberEngine() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите номер двигателя");
                continue;
            }
        }
    }

    public int inputPowerEngine() {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());

                return number;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите кол-во лошадиных сил");
                continue;
            }
        }
    }

    public String inputString() {
        return scan.next();
    }
}