package by.epam.prog_with_class.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Train> arrayOftrains = new ArrayList<Train>();
        arrayOftrains.add(new Train("Питер", 205, 1830));
        arrayOftrains.add(new Train("Минск", 29, 1250));
        arrayOftrains.add(new Train("Киев", 79, 800));
        arrayOftrains.add(new Train("Архангельск", 120, 1520));
        arrayOftrains.add(new Train("Киев", 100, 700));

        Input input = new Input();
        Output output = new Output();
        Logic logic = new Logic();

        int num = input.UserInput();
        output.userOutput(num,arrayOftrains);

        System.out.println("Как будем сортировать?\n" +
                "1 - по номеру поезда\n" +
                "2 - по пункту назначения");

        int a = input.UserInput2();

        switch (a) {
            case 1: {
                output.printArray(logic.sortingByNumbers(arrayOftrains));
                break;
            }
            case 2: {
                output.printArray(logic.sortingByTime(logic.sortByDestination(arrayOftrains)));
                break;
            }
        }

    }
}