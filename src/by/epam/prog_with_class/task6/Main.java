package by.epam.prog_with_class.task6;

public class Main {

    public static void main(String[] args) {

        final int SET_HOUR = 3;
        final int SET_MIN = 457;
        final int SET_SEC = 2700;

        Input in = new Input();
        Logic l = new Logic();
        Time time = new Time(in.inputHour(), in.inputMinute(), in.inputSecond());

        System.out.println("Время " + time.getHour() + " :" + time.getMinute() + " :" + time.getSecond());
        System.out.println();
        System.out.println("Изменение времени на заданные величины. Введите:\n" +
                "1 - если будем уменьшать время на заданные секунды\n" +
                "2 - если будем увеличивать время на заданные секунды\n" +
                "3 - если будем уменьшать время на заданные минуты\n" +
                "4- если будем увеличивать время на заданные минуты\n" +
                "5 - если будем уменьшать время на заданные часы\n" +
                "6 - если будем увеличивать время на заданные часы\n");
        int x = in.inputChoiсe();
        switch (x) {
            case 1:
                l.minusSec(time, SET_SEC);
                break;
            case 2:
                l.plusSec(time, SET_SEC);
                break;
            case 3:
                l.minusMinute(time, SET_MIN);
                break;
            case 4:
                l.plusMinute(time, SET_MIN);
                break;
            case 5:
                l.minusHour(time, SET_HOUR);
                break;
            case 6:
                l.plusHour(time, SET_HOUR);
                break;
        }
        System.out.println("Измененное время " + time.getHour() + " :" + time.getMinute() + " :" + time.getSecond());
    }
}
