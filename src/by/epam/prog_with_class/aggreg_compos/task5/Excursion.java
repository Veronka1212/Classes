package by.epam.prog_with_class.aggreg_compos.task5;

public class Excursion extends Tour{

    public Excursion(){
    }
    public Excursion (String transport, String food, int duration, double price){
        super(transport,food,duration,price);
        this.tourType="экскурсия";
    }

    @Override
    public String toString() {
        return "Тип тура: "+tourType+super.toString();
    }
}

