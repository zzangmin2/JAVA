package interfaceex;

public abstract class Calculator implements Calc{   //추상 메서드 times() divide() 구현 x -> Calculator는 추상 메서드
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
