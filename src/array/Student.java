package array;

public class Student {
    String studentID;
    String name;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public void showStudentInfo(){
        System.out.println(studentID+","+name);
    }
}
