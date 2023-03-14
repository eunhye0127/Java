package ch12;

public class EqualsExam {
    public static void main(String[] args) {
        Student s1 = new Student(1,"choi");
        Student s2 = new Student(1,"choi");
        System.out.println(s1.equals(s2));

        String str1 = "busan";
        String str2 = "busan";
        System.out.println(str1==str2);

        String str3 = new String("software");
        String str4 = new String("software");
        System.out.println(str3==str4);
    }
}
