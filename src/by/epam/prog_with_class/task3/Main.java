package by.epam.prog_with_class.task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student("IvanovVV", 41850, new int[]{7, 8, 9, 10, 8}));
        student.add(new Student("PetrovVV", 41850, new int[]{10, 8, 9, 10, 8}));
        student.add(new Student("SidorovVV", 42840, new int[]{9, 9, 9, 10, 8}));
        student.add(new Student("KorelinVV", 414739, new int[]{7, 4, 9, 6, 8}));
        student.add(new Student("PutinVV", 42840, new int[]{7, 8, 9, 10, 8}));
        student.add(new Student("BushVV", 46872, new int[]{9, 8, 5, 10, 8}));
        student.add(new Student("BuzovaVV", 40883, new int[]{4, 8, 9, 6, 8}));
        student.add(new Student("DornVV", 40002, new int[]{9, 9, 9, 10, 9}));
        student.add(new Student("GubinVV", 41423, new int[]{7, 8, 9, 8, 8}));
        student.add(new Student("KokhnoVV", 44002, new int[]{7, 8, 7, 7, 8}));

        System.out.println("Отличники: ");
        Logic logic=new Logic();
        logic.printingExcellentStudents(student);
    }
}
