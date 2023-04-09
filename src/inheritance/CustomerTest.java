package inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "이순신");
        Customer customerShin = new Customer(10010, "신사임당");
        Customer customerHong = new GoldCustomer(10010, "홍길동");
        Customer customerYoul = new GoldCustomer(10010, "이율곡");
        Customer customerKim = new VIPCustomer(10010, "김유신",12345);

        //ArrayList의 add속성을 사용해 객체 배열에 고객 추가
        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYoul);
        customerList.add(customerKim);

        System.out.println("===== 고객 정보 출력 =====");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===== 할인율과 보너스 포인트 계산 =====");  //다형성 구현
        int price = 10000;
        for(Customer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이" + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는" + customer.bonusPoint + "점입니다.");
        }
    }
}
