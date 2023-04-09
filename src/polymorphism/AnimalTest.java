package polymorphism;


import java.util.ArrayList;

    class Animal {
        public void move() {
            System.out.println("동물이 움직입니다.");
        }
    }
    class Human extends Animal {
        public void move() {
            System.out.println("사람이 두 발로 걷습니다.");
        }

        public void readBook() {
            System.out.println("사람이 책을 읽습니다. ");
        }
    }

    class Tiger extends Animal {
        public void move() {
            System.out.println("호랑이가 네 발로 뜁니다.");
        }

        public void hunting(){
            System.out.println("호랑이가 사냥을 합니다.");
        }
    }

    class Eagle extends Animal {
        public  void move(){
            System.out.println("독수리가 하늘을 납니다.");
        }

        public void flying(){
            System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
        }
    }

public class AnimalTest {
        ArrayList<Animal> aniList = new ArrayList<Animal>();

    public static void main(String[] args) {
        AnimalTest aTest  = new AnimalTest();
        aTest.addAnimal();
        System.out.println("원래 형으로 다운캐스팅");
        aTest.testCasting();
    }

    public void addAnimal(){
        aniList.add(new Human());   //ArrayList형에 추가되면서 Animal형으로 형 변환
        aniList.add(new Tiger());
        aniList.add(new Eagle());

        for(Animal ani : aniList){  //배열 요소를 Animal형으로 꺼내서 move()를 호출하면 재정의된 함수가 호출됨
            ani.move();
        }
    }

    public void testCasting(){
        for(int i = 0; i <aniList.size(); i++){ //모든 배열 요소를 하나씩 돌면서
            Animal ani = aniList.get(i);    //Animal형으로 가져옴
            if(ani instanceof Human ) { //human 다운캐스팅
                Human h = (Human)ani;
                h.readBook();
            }
            else if(ani instanceof Tiger){  //tiger 다운캐스팅
                Tiger t = (Tiger)ani;
                t.hunting();
            }
            else if(ani instanceof Eagle){  //eagle 다운캐스팅
                Eagle e = (Eagle)ani;
                e.flying();
            }
            else{
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }
}

