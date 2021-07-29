package by.epam.prog_with_class.task4;

import java.util.ArrayList;

public class Output {

    public void userOutput(int num, ArrayList<Train> array) {
        int flag = 0;
        for (Train t : array) {
            if (t.getNumber() == num) {
                flag++;
                System.out.println("Информация о поезде номер " + num + ": ");
                System.out.println("Пункт назначения " + t.getDestination());
                System.out.println("Время прибытия: " + t.getDepartureTime());
            }
        }
        if (flag == 0) {
            System.out.println("Информация о поезде не найдена");
        }
    }

    public void printArray(ArrayList<Train> array) {
        int flag = 0;
        for (Train t : array) {
            System.out.println("Поезд номер " + t.getNumber() + ": Пункт назначения - " + t.getDestination() + ";  Время прибытия: " + t.getDepartureTime());
        }
    }
}
