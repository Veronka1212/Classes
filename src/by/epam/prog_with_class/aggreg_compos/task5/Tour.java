package by.epam.prog_with_class.aggreg_compos.task5;

public class Tour {

    public String tourType;
    private String transport;
    private String food;
    private int duration;
    private double price;

    public Tour(){

    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public Tour(String transport, String food, int duration, double price) {
        this.transport = transport;
        this.food = food;
        this.duration = duration;
        this.price = price;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "; Транспорт: " + transport +", питание: " + food +", длительность: " + duration +", цена:" + price;
    }

}
