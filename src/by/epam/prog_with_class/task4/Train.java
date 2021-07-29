package by.epam.prog_with_class.task4;

public class Train {

    public Train(String destination, int number, int departureTime) {
        this.destination = destination;
        this.number = number;
        this.departureTime = departureTime;
    }

    private String destination;
    private int number;
    private int departureTime;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public Train() {

    }

}
