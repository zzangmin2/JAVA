package staticex;

public class StudentTest4 {
    public static void main(String[] args) {
        Student2 studentLee = new Student2();
        studentLee.setStudentName("이짱민");
        System.out.println(Student2.getSerialNum());    //serial 값을 가져오기 위해 get()메서드를 클래스 이름으로 직접 호출
        System.out.println(studentLee.studentName + "학번 " + studentLee.studentID);


        Student2 studentSon = new Student2();
        studentSon.setStudentName("손짱민");
        System.out.println(Student2.getSerialNum());
        System.out.println(studentSon.studentName + "학번: " + studentSon.studentID);
    }
}
