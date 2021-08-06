package by.epam.prog_with_class.aggreg_compos.task3;

import java.util.Objects;

public class City {

    public City(String name, double square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Double.compare(city.square, square) == 0 && population == city.population && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, population);
    }

    @Override
    public String toString() {
        return "город " +name;
    }

    private String name;
    private double square;
    private int population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
