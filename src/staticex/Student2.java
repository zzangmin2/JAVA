package staticex;

public class Student2  {
    private static int serialNum = 1000;    //외부 클래스에서 serialNum 변수를 직접 참조하지 못하도록 private 변수로 변경
    int studentID;
    String studentName;
    int grade;
    String address;

    public Student2() {
        serialNum++;
        studentID = serialNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }

    public static int getSerialNum() {  //serialNum의 get()메서드
        int i = 10;
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {    //serialNum의 set()메서드
        Student2.serialNum = serialNum;
    }
}
