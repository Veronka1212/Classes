package by.epam.prog_with_class.task6;

public class Logic {

    public Time plusHour(Time time, int value) {
        time.setHour(time.getHour() + value);
        if (time.getHour() >= 24) {
            time.setHour(time.getHour() - 24);
        }
        return time;
    }

    public Time minusHour(Time time, int value) {
        time.setHour(time.getHour() - value);
        if (time.getHour() < 0) {
            time.setHour(24 - time.getHour());
        }
        return time;
    }

    public Time plusMinute(Time time, int value) {
        int calc = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond() + value * 60;
        time.setHour(calc / 3600);
        time.setMinute((calc - time.getHour() * 3600) / 60);
        time.setSecond(calc - time.getHour() * 3600 - time.getMinute() * 60);
        return time;
    }

    public Time minusMinute(Time time, int value) {
        int calc = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond() - value * 60;
        time.setHour(calc / 3600);
        time.setMinute((calc - time.getHour() * 3600) / 60);
        time.setSecond(calc - time.getHour() * 3600 - time.getMinute() * 60);
        return time;
    }

    public Time plusSec(Time time, int value) {
        int calc = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond() + value;
        time.setHour(calc / 3600);
        time.setMinute((calc - time.getHour() * 3600) / 60);
        time.setSecond(calc - time.getHour() * 3600 - time.getMinute() * 60);
        return time;
    }

    public Time minusSec(Time time, int value) {
        int calc = time.getHour() * 3600 + time.getMinute() * 60 + time.getSecond() - value;
        time.setHour(calc / 3600);
        time.setMinute((calc - time.getHour() * 3600) / 60);
        time.setSecond(calc - time.getHour() * 3600 - time.getMinute() * 60);
        return time;
    }
}
