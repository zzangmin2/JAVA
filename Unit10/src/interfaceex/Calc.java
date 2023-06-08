package interfaceex;

public interface Calc {
    //Calc 인터페이스 만들기

    //디폴트 메서드: 인터페이스에서 구현. 인터페이스를 구현한 클래스가 생성되면 그 클래스에서 사용할 기본 기능
    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod(); //디폴트 메서드에서 private 메서드 호출

    }

    //정적 메서드: 클래스 생성과 무관하게 사용 가능
    static int total(int[] arr){
        int total =0;

        for(int i : arr){
            total += i;
        }
        myStaticMethod();   //정적 메서드에서 private static 메서드 호출
        return total;
    }

    //private 메서드
    private void myMethod(){
        System.out.println("Private 메서드입니다.");
    }
    //private static 메서드
    private static void myStaticMethod(){
        System.out.println("private static 메서드 입니다.");
    }
    //인터페이스에서 선언한 변수는 컴파일 과정에서 !! 상수 !!로 변환됨
    double PI = 3.14;
    int ERROR = -999999999;

    //인터페이스에서 선언한 메서드는 컴파일 과정에서 !! 추상 메서드 !!로 변환됨
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
