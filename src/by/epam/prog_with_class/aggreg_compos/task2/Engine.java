package by.epam.prog_with_class.aggreg_compos.task2;

import java.util.Objects;

public class Engine {

    private int number;
    private int power;

    public Engine(){

    }

    public Engine(int number, int power) {
        this.number = number;
        this.power = power;
    }

    @Override
    public String toString() {
        return ", двигатель номер " + number + " мощностью " + power + " лошадиных сил,";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return number == engine.number && power == engine.power;
    }

    public int hashCode() {
        return Objects.hash(number, power);
    }

}
