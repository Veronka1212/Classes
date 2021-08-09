package by.epam.prog_with_class.aggreg_compos.task5;

//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки 
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать 
//возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Input input = new Input();
        Choice c = new Choice();

        ArrayList<Tour> tours = new ArrayList<>();
        tours.add(new Relax("авиа", "all inclusive", 7, 2500));
        tours.add(new Excursion("авиа", "завтрак", 7, 750));
        tours.add(new HealthImprovement("автобус", "завтрак", 14, 1500));
        tours.add(new Shopping("автобус", "нет питания", 3, 400));
        tours.add(new Shopping("автобус", "нет питания", 3, 200));
        tours.add(new Cruise("корабль", "завтрак", 10, 500));

        Tour tour = new Tour();

        System.out.println("Выберите тип путевки:\n" +
                "1 - отдых\n" +
                "2 - экскурсия\n" +
                "3 - оздоровление\n" +
                "4 - шоппинг\n" +
                "5 - круиз\n");
        int x = input.UserInput();

        switch (x) {
            case 1: {
                tour.tourType = "отдых";
                break;
            }
            case 2: {
                tour.tourType = "экскурсия";
                break;
            }
            case 3: {
                tour.tourType = "оздоровление";
                break;
            }
            case 4: {
                tour.tourType = "шоппинг";
                break;
            }
            case 5: {
                tour.tourType = "круиз";
                break;
            }

        }
        System.out.println("Выберите тип питания: \n" +
                "1 - завтрак\n" +
                "2 - all inclusive\n" +
                "3 - нет питания\n");
        int y = input.UserInput2();
        switch (y) {
            case 1: {
                tour.setFood("завтрак");
                break;
            }
            case 2: {
                tour.setFood("all inclusive");
                break;
            }
            case 3: {
                tour.setFood("нет питания");
                break;
            }
        }

        System.out.println("Выберите тип транспорта: \n" +
                "1 - авиаперелет\n" +
                "2 - автобус\n" +
                "3 - корабль\n");
        int z = input.UserInput2();

        switch (z) {
            case 1: {
                tour.setTransport("авиаперелет");
                break;
            }
            case 2: {
                tour.setTransport("автобус");
                break;
            }
            case 3: {
                tour.setTransport("корабль");
                break;
            }
        }

        System.out.println("Введите количество дней поездки");
        tour.setDuration(input.UserInput3());

        ArrayList<Tour> selectedTours;
        selectedTours = c.UserChoiceTour(tours, tour);

        for (Tour ac : selectedTours)
            System.out.println(ac.toString());

        if (selectedTours.size() == 0) {
            System.out.println("Туры не найдены");
        } else {
            System.out.println("Сортированные найденные туры по цене:");

            Comparator<Tour> sort1 = new Sorting1();
            selectedTours.sort(sort1);
            for (Tour ac : selectedTours)
                System.out.println(ac.toString());
        }
    }
}
