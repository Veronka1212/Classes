package by.epam.prog_with_class.aggreg_compos.task5;

public class Relax extends Tour {

    public Relax() {
    }

    public Relax(String transport, String food, int duration, double price) {
        super(transport, food, duration, price);
        this.tourType = "отдых";
    }

    @Override
    public String toString() {
        return "Тип тура: " + tourType + super.toString();
    }
}

