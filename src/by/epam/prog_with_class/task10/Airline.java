package by.epam.prog_with_class.task10;

public class Airline {

    public Airline(){

    }

    public Airline(String destination, int flightNumber, String typeOfAirplane, int time, String dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAirplane = typeOfAirplane;
        this.time = time;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAirplane() {
        return typeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        this.typeOfAirplane = typeOfAirplane;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", typeOfAirplane='" + typeOfAirplane + '\'' +
                ", time=" + time +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }

    private String destination;
    private int flightNumber;
    private String typeOfAirplane;
    private int time;
    private String dayOfWeek;
}
