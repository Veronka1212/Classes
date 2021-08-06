package by.epam.prog_with_class.aggreg_compos.task3;

import java.util.ArrayList;
import java.util.Objects;

public class Region{

    public Region(){

    }

    public Region(String name, City capitalCity, ArrayList<District> oblast) {

        this.name = name;
        this.capitalCity = capitalCity;
        this.oblast = oblast;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(name, region.name) && Objects.equals(capitalCity, region.capitalCity) && Objects.equals(oblast, region.oblast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capitalCity, oblast);
    }

    @Override
    public String toString() {
        return "область " +name;
    }

    private String name;
    private City capitalCity;
    private ArrayList<District> oblast;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(City capitalCity) {
        this.capitalCity = capitalCity;
    }

    public ArrayList<District> getOblast() {
        return oblast;
    }

    public void setOblast(ArrayList<District> oblast) {
        this.oblast = oblast;
    }

    public void addRegoins(District dis) {
        this.oblast.add(dis);
    }
}
