package by.epam.prog_with_class.aggreg_compos.task2;

public class Main {
    public static void main(String[] args) {

        Input i = new Input();
        String m;
        System.out.println("Введите марку автомобиля ");
        m = i.inputString();

        Wheel wheel = new Wheel();
        Engine engine = new Engine();
        Car myCar = new Car(engine, wheel, m);

        System.out.println("Введите номер двигателя ");
        engine.setNumber(i.inputNumberEngine());
        System.out.println("Введите мощность двигателя");
        engine.setPower(i.inputPowerEngine());
        System.out.println("Введите диаметр колес");
        wheel.setDiameter(i.inputWheelSize());
        System.out.println("Введите модель колес");
        wheel.setModel(i.inputString());
        System.out.println("Введите сезонность: 1 - лето, 2 - зима, 3 - всесезонные");
        int n = i.input();
        switch (n) {
            case 1: {
                wheel.setSeason("лето");
                break;
            }
            case 2: {
                wheel.setSeason("зима");
                break;
            }
            case 3: {
                wheel.setSeason("всесезонные");
                break;
            }
        }
        System.out.println();
        System.out.println(myCar.toString());
        System.out.println();
        System.out.println(
                "Что будем делать?\n" +
                        "1. ехать\n" +
                        "2. заправляться\n" +
                        "3. менять колесо\n" +
                        "4. марка авто\n");
        int x = i.input();
        switch (x) {
            case 1: {
                myCar.drive();
                break;
            }
            case 2: {
                myCar.refueling();
                break;
            }
            case 3: {
                myCar.changeWheel();
                break;
            }
            case 4: {
                System.out.println(m);
                break;
            }
        }
    }
}
