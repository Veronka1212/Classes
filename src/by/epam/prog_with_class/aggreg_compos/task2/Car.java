package by.epam.prog_with_class.aggreg_compos.task2;


public class Car {

    public Car(Engine engine, Wheel weels, String carModel) {
        this.engine = engine;
        this.weels = weels;
        this.carModel = carModel;
    }

    private Engine engine;
    private Wheel weels;
    private String carModel;

    public Car() {

    }

    @Override
    public String toString() {
        return "Машина марки " + carModel + engine.toString() + weels.toString();
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWeels() {
        return weels;
    }

    public void setWeels(Wheel weels) {
        this.weels = weels;
    }

    public void drive() {
        System.out.println(carModel + " едет!");
    }

    public void refueling() {
        System.out.println(carModel + " заправляет топливо!");
    }

    public void changeWheel() {
        System.out.println(carModel + " меняет колесо!");
    }
}
