package by.epam.prog_with_class.task10;

import java.util.ArrayList;

public class Logic {

    public void outputForaGivenDestination (ArrayList<Airline> array, String d) {
        int flag = 0;
        for (Airline b : array) {
            if (b.getDestination().equalsIgnoreCase(d)) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Самолетов в данном направлении не найдено");
        }
    }

    public void outputForaGivenDay (ArrayList<Airline> array, String d) {
        int flag = 0;
        for (Airline b : array) {
            if (b.getDayOfWeek().equalsIgnoreCase(d)) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Самолетов в данный день недели не найдено");
        }
    }

    public void outputForaGivenDayAndTime (ArrayList<Airline> array, String d, int time) {
        int flag = 0;
        for (Airline b : array) {
            if (b.getDayOfWeek().equalsIgnoreCase(d) & b.getTime()>time) {
                System.out.println(b.toString());
                flag++;
            }
        }
        if (flag == 0) {
            System.out.println("Самолетов по заданным требованиям не найдено");
        }
    }
}
