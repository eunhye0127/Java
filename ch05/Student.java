package ch05;

//static
public class Student {
    String name;
    static String group = "SW";
    final static String school = "Busan software meister";

    void showInfo() {
        System.out.println("이름은 " + name + "이고, 학과는 " + group + "입니다.");
    }
}
