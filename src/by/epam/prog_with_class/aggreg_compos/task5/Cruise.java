package by.epam.prog_with_class.aggreg_compos.task5;

public class Cruise extends Tour{

    public Cruise (){
    }

    public Cruise (String transport, String food, int duration, double price){
        super(transport,food,duration,price);
        this.tourType="круиз";
    }

    @Override
    public String toString() {
        return "Тип тура: "+tourType+super.toString();
    }
}
