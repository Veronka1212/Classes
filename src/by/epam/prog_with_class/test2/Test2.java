package by.epam.prog_with_class.test2;

public class Test2 {

    private int a;
    private int b;

    public Test2 () {
        a = 0;
        b =0;
    }

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

    public Test2 (int a, int b) {
        this.a = a;
        this.b = b;
    }
}
