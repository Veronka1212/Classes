package by.epam.prog_with_class.task7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        Logic l = new Logic();

        int[] triangle = {2, 9, 5, -3, 7, 0};
        t.setX1(triangle[0]);
        t.setY1(triangle[1]);
        t.setX2(triangle[2]);
        t.setY2(triangle[3]);
        t.setX3(triangle[4]);
        t.setY3(triangle[5]);

        System.out.println("Площадь треугольника равна " + l.square(t));
        System.out.println("Периметр треугольника равен " + l.perimeter(t));
        System.out.println("Точка пересечения медиан " + Arrays.toString(l.mediana(t)));
    }
}
