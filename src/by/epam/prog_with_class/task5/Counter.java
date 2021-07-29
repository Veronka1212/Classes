package by.epam.prog_with_class.task5;

public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int value) {
        if (value > 9) {
            this.value = 9;
        } else if (value < 0) {
            this.value = 0;
        } else {
            this.value = value;
        }
    }

    public void increment() {
        value++;
        if (value > 9) {
            value = 0;
        }
    }

    public void decrement() {
        value--;
        if (value < 0) {
            value = 9;
        }
    }

    public int numberValue() {
        return value;
    }
}
