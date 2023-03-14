package ch09;

//하위 클래스에서는 상위 클래스 생성자를 부른다. 무조건
public class Taxi extends Car{
    private  int meter;

    public Taxi(String color, String company, String model) {
        super(color, company, model);
    }

    public void startMeter() {
        System.out.println("미터기를 올리다.");
        startCar();
        System.out.println("택시가 출발합니다.");
    }

    public void stopMeter() {
        System.out.println("미터기를 정지하다.");
        stopCar();
    }

}
