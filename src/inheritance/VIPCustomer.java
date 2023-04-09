package inheritance;

public class VIPCustomer extends Customer{  //VIPCustomer 클래스는 Customer 클래스를 상속 받음
    private int agentID; //VIP 고객 상담원 아이디
    double saleRatio;   //할인율

    //메소드 오버라이딩 : 상위 클래스에 정의한 메서드가 하위 클래스에서 구현할 내용과 맞지 않을 경우에 하위 클래스에서 메서드를 재정의 하는 것
    @Override
    public int calcPrice(int price) {   //지불가격 메서드 재정의
        bonusPoint += price * bonusRatio;   //보너스 포인트 적립
        return price - (int)(price * saleRatio);    //할인된 가격을 계산하여 반환
    }

    public VIPCustomer() {  //묵시적으로 Customer()생성자가 호출 됨. 하위 클래스가 생성될 때는 상위 클래스의 디폴트 생성자를 호출하는 super()가 자동으로 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        //System.out.println("VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);    //상위 클래스 생성자 호출
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        //System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    public String showCustomerInfo() {
        return super.showCustomerInfo() + "담당 상담원 번호는" + agentID + "입니다.";
    }

    public int getAgentID(){
        return agentID;
    }
}
