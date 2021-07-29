package by.epam.prog_with_class.task7;

public class Logic {

    public double square(Triangle t) {

        double x1 = t.getX1();
        double y1 = t.getY1();
        double x2 = t.getX2();
        double y2 = t.getY2();
        double x3 = t.getX3();
        double y3 = t.getY3();

        return Math.abs(0.5 * ((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
    }

    public double perimeter(Triangle t) {

        double x1 = t.getX1();
        double y1 = t.getY1();
        double x2 = t.getX2();
        double y2 = t.getY2();
        double x3 = t.getX3();
        double y3 = t.getY3();

        double ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double bc = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        double ac = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

        return ab + bc + ac;
    }

    public double[] mediana(Triangle t) {

        double x1 = t.getX1();
        double y1 = t.getY1();
        double x2 = t.getX2();
        double y2 = t.getY2();
        double x3 = t.getX3();
        double y3 = t.getY3();

        double[] dot = new double[2];
        dot[0] = (x1 + x2 + x3) / 3;
        dot[1] = (y1 + y2 + y3) / 3;

        return dot;
    }
}
