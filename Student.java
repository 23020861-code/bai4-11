public class Student extends Person {
    private String studentID;

    public Student(String fullName, String email, String studentID) {
        super(fullName, email);
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }
}
