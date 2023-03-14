package ch07;

public class Student {
    private String name;
    int grade;
    static int count;
    //접근제어 지시자 (public, private, protected)
    public  Student() {
        count++;
    }

    public  Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public static int getCount() {
        return count;
    }
}
