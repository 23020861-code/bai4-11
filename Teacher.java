public class Teacher extends Person {
    private String teacherID;
    private String title;

    public Teacher(String fullName, String email, String teacherID, String title) {
        super(fullName, email);
        this.teacherID = teacherID;
        this.title = title;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getTitle() {
        return title;
    }
}
