package by.epam.prog_with_class.task6;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Input {
    Scanner scanner;

    {
        scanner = new Scanner(System.in);
    }

    public int inputChoiсe() {
        int c;
        while (true) {
            try {
                c = parseInt(scanner.next());
                if (c >= 1 & c<=6) {
                    return c;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите натуральное числовое значение");
                continue;
            }
            System.out.println("Прочитайте условие и введите число от 1 до 6");;
        }
    }

    public int inputHour() {
        System.out.println("Введите количество часов ");
        int hour;
        while (true) {
            try {
                hour = parseInt(scanner.next());
                if (hour >= 0 & hour<=23) {
                    return hour;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите натуральное числовое значение");
                continue;
            }
            return 0;
        }
    }

    public int inputMinute() {
        System.out.println("Введите количество минут ");
        int min;
        while (true) {
            try {
                min = parseInt(scanner.next());
                if (min >= 0 & min<=59) {
                    return min;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите натуральное числовое значение");
                continue;
            }
            return 0;
        }
    }

    public int inputSecond() {
        System.out.println("Введите количество секунд ");
        int sec;
        while (true) {
            try {
                sec = parseInt(scanner.next());
                if (sec >= 0 & sec<=59) {
                    return sec;
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод, введите натуральное числовое значение");
                continue;
            }
            return 0;
        }
    }
}
