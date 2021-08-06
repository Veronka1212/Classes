package by.epam.prog_with_class.aggreg_compos.task3;

import java.util.ArrayList;
import java.util.Objects;

public class Country {

    public Country(String name, City capital, ArrayList<Region> regions, double square) {
        this.name = name;
        this.capital = capital;
        this.regions = regions;
        this.square = square;
    }

    private String name;
    private City capital;
    private ArrayList<Region> regions;
    private double square;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return Double.compare(country.square, square) == 0 && Objects.equals(name, country.name) && Objects.equals(capital, country.capital) && Objects.equals(regions, country.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, regions, square);
    }

    public Country() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        this.regions = regions;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void addRegoins(Region reg) {
        this.regions.add(reg);
    }

    @Override
    public String toString() {
        return " Страна " + name;
    }

    public String capital() {
        return " Столица " + capital;
    }

    public String printRegions() {
        return " Количество регионов " + regions.size();
    }

    public String printSquare() {
        return " Площадь " + square;
    }
}
