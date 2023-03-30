package constructor;

public class PersonTest {
    public static void main(String[] args) {
        //디폴트 생성자로 클래스를 생성한 후 인스턴스 변수 값을 따로 초기화
        Person personKim = new Person();
        personKim.name = "김짱민";
        personKim.weight = 100;
        personKim.height = 200;


        //인스턴스 변수 초기화와 동시에 클래스 생성
        Person personLee = new Person("이짱민", 180, 80);
    }
}
