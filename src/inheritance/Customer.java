package inheritance;

public class Customer {
    //멤버 변수
    //protected -> 외부 클래스에서 사용 불가. but 하위 클래스에서는 사용할 수 있도록 지정하는 예약어
    protected int customerID; //고객 아이디
    protected String customerName;    //고객 이름
    protected String customerGrade; //고객 등급
    int bonusPoint; //보너스 포인트
    double bonusRatio;  //적립 비율

    //디폴트 생성자
    public Customer(){
        customerGrade = "SILVER";   //기본 등급
        bonusRatio = 0.01;  //보너스 포인트 기본 적립 비용
        System.out.println("Customer() 생성자 호출");
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;
        System.out.println("Customer(int, String) 생성자 호출! ");
    }

    //보너스 포인트 적립, 지불 가격 계산 메소드
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;   //보너스 포인트 계산
        return price;
    }

    public String showCustomerInfo() {
        return customerName + " 님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
    }

    //protected 예약어로 선언한 변수를 외부에서 사용할 수 있도록 get(), set()메서드 추가
    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerName(String customerName){
        this.customerName =customerName;
    }
}
