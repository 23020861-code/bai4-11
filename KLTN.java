public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private String thesisTitle;
    private T student;
    private V advisor;

    public KLTN(String thesisTitle, T student, V advisor) {
        this.thesisTitle = thesisTitle;
        this.student = student;
        this.advisor = advisor;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    @Override
    public int compareTo(KLTN<T, V> other) {
        return this.thesisTitle.compareToIgnoreCase(other.thesisTitle);
    }

    @Override
    public String toString() {
        return "KLTN: " + thesisTitle + "\n  Student: " + student.getFullName() +
                "\n  Advisor: " + advisor.getFullName() + "\n";
    }
}
