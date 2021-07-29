package by.epam.prog_with_class.task4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {

    Scanner scan = new Scanner(System.in);

    public int UserInput() {
        System.out.println("Введите номер поезда, информация о котором вас интересует: ");
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number >= 0) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите номер поезда");
                continue;
            }
            System.out.println("Введены некорректные данные, введите номер поезда");
        }
    }

    public int UserInput2 () {
        int number;
        while (true) {
            try {
                number = parseInt(scan.next());
                if (number==1 | number==2) {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите 1 или 2");
                continue;
            }
            System.out.println("Введены некорректные данные");
        }
    }
}

