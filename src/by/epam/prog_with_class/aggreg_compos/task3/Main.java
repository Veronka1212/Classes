package by.epam.prog_with_class.aggreg_compos.task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("Гродно", 20.32, 600000));
        cities.add(new City("Брест", 32.786, 400000));
        cities.add(new City("Витебск", 40.051, 900000));
        cities.add(new City("Гомель", 40.372, 400000));
        cities.add(new City("Могилев", 29.068, 60000));
        cities.add(new City("Минск", 39.854, 2000000));

        Country belarus = new Country();
        belarus.setName("Беларусь");
        belarus.setCapital(cities.get(5));
        belarus.setSquare(207.65);
        belarus.setRegions(new ArrayList<Region>());

        Region mogilRegion = new Region();
        mogilRegion.setName("Могилевская");
        mogilRegion.setCapitalCity(cities.get(4));
        mogilRegion.setOblast(new ArrayList<District>());
        mogilRegion.addRegoins(new District("Бобруйский", 40.3, 350000));
        mogilRegion.addRegoins(new District("Кировский", 34.3, 150000));
        //...
        belarus.addRegoins(mogilRegion);

        Region brestRegion = new Region();
        brestRegion.setName("Брестская");
        brestRegion.setCapitalCity(cities.get(1));
        brestRegion.setOblast(new ArrayList<District>());
        brestRegion.addRegoins(new District("Пинский", 34.3, 50000));
        brestRegion.addRegoins(new District("Барановичский", 20.3, 15000));
        //....
        belarus.addRegoins(brestRegion);

        Region grodnoRegion = new Region();
        grodnoRegion.setName("Гродненская");
        grodnoRegion.setCapitalCity(cities.get(0));
        grodnoRegion.setOblast(new ArrayList<District>());
        //.....
        belarus.addRegoins(grodnoRegion);

        Region gomelRegion = new Region();
        gomelRegion.setName("Гомельская");
        gomelRegion.setCapitalCity(cities.get(3));
        gomelRegion.setOblast(new ArrayList<District>());
        gomelRegion.addRegoins(new District("Жлобинский",45.8,25000));
        //....
        belarus.addRegoins(gomelRegion);

        Region minskRegion = new Region();
        minskRegion.setName("Минская");
        minskRegion.setCapitalCity(cities.get(5));
        minskRegion.setOblast(new ArrayList<District>());
        minskRegion.addRegoins(new District("Борисовский",29.6,190000));
        //....
        belarus.addRegoins(minskRegion);

        Region vitebskRegion = new Region();
        vitebskRegion.setName("Витебская");
        vitebskRegion.setCapitalCity(cities.get(2));
        vitebskRegion.setOblast(new ArrayList<District>());
        vitebskRegion.addRegoins(new District("Полоцкий",28.7,80000));
        //....
        belarus.addRegoins(vitebskRegion);

        System.out.println(belarus.capital()+belarus.printRegions()+belarus.printSquare());

    }
}
