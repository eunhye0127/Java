package ch11;

public class InterfaceExam {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        tv.soundUp();
        tv.soundDown();
        tv.showInfo();

        tv.equals(radio);
    }
}
