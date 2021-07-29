package by.epam.prog_with_class.task10;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {

    Scanner scan = new Scanner(System.in);

    public int UserInput() {
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

    public String input() {
        return scan.next();
    }

    public int InputTime() {
        Integer number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number.toString().length()>=3 & number.toString().length()<=4) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }
}
