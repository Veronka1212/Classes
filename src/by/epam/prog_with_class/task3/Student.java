package by.epam.prog_with_class.task3;

public class Student {

    private String secondName;
    private int group;
    private int [] performans;

    public Student (String secondName, int group, int[] performans) {
        this.secondName = secondName;
        this.group = group;
        this.performans = performans;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getPerformans() {
        return performans;
    }

    public void setPerformans(int[] performans) {
        this.performans = performans;
    }
}
