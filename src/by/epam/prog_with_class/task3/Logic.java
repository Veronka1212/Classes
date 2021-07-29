package by.epam.prog_with_class.task3;

import java.util.ArrayList;

public class Logic {

    public boolean findExcellentsStudent(int[] array) {
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 9 | array[i] == 10) {
                flag++;
            }
        }
        if (flag == array.length) {
            return true;
        } else
            return false;
    }

    public void printingExcellentStudents(ArrayList<Student> array) {
        int flag = 0;

        for (Student s : array) {
            if (findExcellentsStudent(s.getPerformans())) {
                System.out.println(s.getSecondName()+"  "+s.getGroup());
            }
        }
    }
}
