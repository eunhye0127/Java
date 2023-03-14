package ch07;

public class PrivateExam {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student("kim");
        Student s3= new Student();

        s1.setName("choi");

        System.out.println(Student.getCount());
    }
}
