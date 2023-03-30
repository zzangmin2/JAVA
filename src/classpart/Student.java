package classpart;

public class Student {
        int studentID;
        String studentName;
        int grade;
        String address;

        public String getStudentName() {
            return studentName;
        }

        public static void main(String[] args) {
                Student studentKjm = new Student();
                studentKjm.studentName = "김짱민";

                System.out.println(studentKjm.studentName);
                System.out.println(studentKjm.getStudentName());
        }


}
