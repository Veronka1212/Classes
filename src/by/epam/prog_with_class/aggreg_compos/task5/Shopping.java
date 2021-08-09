package by.epam.prog_with_class.aggreg_compos.task5;

public class Shopping extends Tour{

    public Shopping(){

    }

    public Shopping (String transport, String food, int duration, double price){
        super(transport,food,duration,price);
        this.tourType="шоппинг";
    }

    @Override
    public String toString() {
        return "Тип тура: "+tourType+super.toString();
    }
}
