package by.epam.prog_with_class.test1;

public class Test1 {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int summa() {
        return a+b;
    }

    public void larger() {
        if (a > b) System.out.println("Переменная 1 больше");
        if (a < b) System.out.println("Переменная 2 больше ");
        if (a == b) System.out.println("Переменные равны");
    }
}
