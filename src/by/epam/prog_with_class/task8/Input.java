package by.epam.prog_with_class.task8;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Input {

    Scanner scan=new Scanner(System.in);

    public int UserInput() {
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
