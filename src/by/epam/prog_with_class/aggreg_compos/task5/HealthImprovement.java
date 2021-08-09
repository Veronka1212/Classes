package by.epam.prog_with_class.aggreg_compos.task5;

public class HealthImprovement extends Tour{

    public HealthImprovement(){
    }

    public HealthImprovement (String transport, String food, int duration, double price){
        super(transport,food,duration,price);
        this.tourType="оздоровление";
    }

    @Override
    public String toString() {
        return "Тип тура: "+tourType+super.toString();
    }

}
