package by.epam.prog_with_class.task5;

import by.epam.prog_with_class.task5.Counter;

public class Main {

    public static void main(String[] args) {

        final int INICIAL_VALUE = 100;
        final int INICIAL_VALUE2 = 5;
        Counter counter = new Counter();

        System.out.println("Увеличить значение счетчика: ");
        for (int i = 0; i < INICIAL_VALUE; i++) {
            System.out.print(counter.numberValue() + " ");
            counter.increment();
        }

        System.out.println();

        System.out.println("Уменьшить значение счетчика: ");
        for (int i = 0; i < INICIAL_VALUE; i++) {
            System.out.print(counter.numberValue() + " ");
            counter.decrement();
        }

        System.out.println();

        System.out.println("Инициализирую значение счетчика...");
        Counter inicialCount = new Counter(INICIAL_VALUE2);
        System.out.println(inicialCount.numberValue());
    }
}

