package by.epam.prog_with_class.aggreg_compos.task3;

import java.util.Objects;

public class District {

    public District(){

    }

    public District(String name, double square, int population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.square, square) == 0 && population == district.population && Objects.equals(name, district.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, square, population);
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", square=" + square +
                ", population=" + population +
                '}';
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
