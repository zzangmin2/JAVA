package cooperation;

public class Student {
    public String studentName;
    public int grade;
    public int money;

    public Student(String studentName, int money){  //학생 이름과 가진 돈을 매개변수로 받는 생성자
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){   //학생이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway (Subway subway){ //학생이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo(){
        System.out.println(studentName + "님의 남은 돈은" +money+"입니다.");
    }
}
