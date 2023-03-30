package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKjm = new Student();
        studentKjm.studentName = "김짱민";

        System.out.println(studentKjm.studentName);
        System.out.println(studentKjm.getStudentName());
    }
}
