package template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();
    public void startCar(){
        System.out.println("시동을 켭니다.");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다.");
    }

    //템플릿 메서드
    //템플릿 메서드는 실행 순서, 즉 시나리오를 정의한 메서드이므로 바꿀 수 x
    //상위 클래스를 상속받은 하위 클래서에서 템플릿 메서드 정의 x -> final 예약어 사용
    final public void run(){
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
