package by.epam.prog_with_class.aggreg_compos.task5;

import java.util.ArrayList;

public class Choice {

    public ArrayList<Tour> UserChoiceTour (ArrayList<Tour> tours,Tour userTour){
       ArrayList<Tour> choice = new ArrayList<>();

       for(Tour t:tours){
           if (t.tourType.equals(userTour.tourType) &
                   t.getFood().equals(userTour.getFood()) &
                   t.getTransport().equals(userTour.getTransport()) &
                   t.getDuration()==userTour.getDuration()){
               choice.add(t);
           }
       }
    return choice;
    }
}
