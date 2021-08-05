package by.epam.prog_with_class.aggreg_compos.task2;

import java.util.Objects;

public class Wheel {

    private int diameter;
    private String model;
    private String season;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter && Objects.equals(model, wheel.model) && Objects.equals(season, wheel.season);
    }

    public int hashCode() {
        return Objects.hash(diameter, model, season);
    }

    public Wheel() {

    }

    public Wheel(int diameter, String model, String season) {
        this.diameter = diameter;
        this.model = model;
        this.season = season;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return " на колесах диаметром " + diameter + " модели " + model + ", cезон - " + season + ".";
    }

}
