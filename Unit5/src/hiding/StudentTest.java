package hiding;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        //studentLee.studentName = "김짱민"; //Student 클래스의 접근 제어자 private 선언 -> 오류 뱔생
        studentLee.setStudentName("이짱민");//-> get(), set()메서드 사용 -> 오류 해결

        System.out.println(studentLee.getStudentName());
    }
}
