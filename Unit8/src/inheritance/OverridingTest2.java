package inheritance;

public class OverridingTest2 {
    public static void main(String[] args) {
        //묵시적 형 변환에 의해 VIPCustomer가 Customer형으로 변환
        //but 인스턴스의 메서드가 호출 됨 -> 가상 메서드
        Customer vc = new VIPCustomer(10030, "나몰라", 2000); //VIP 고객 생성
        vc.bonusPoint = 1000;

        System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
    }
}
