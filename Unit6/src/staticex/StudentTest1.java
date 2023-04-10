package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이짱민");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        Student studentSon = new Student();
        studentSon.setStudentName("손짱민");

        System.out.println(studentSon.serialNum);
        System.out.println(studentLee.serialNum);
    }
}
