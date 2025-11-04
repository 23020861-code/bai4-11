public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Pham Minh Khoa", "khoa@school.edu", "SV101");
        Student st2 = new Student("Tran Thi Lan", "lan@school.edu", "SV102");

        Teacher tc1 = new Teacher("Dr. Doan Quang Huy", "huy@school.edu", "GV101", "PhD");
        Advisor ad1 = new Advisor("Le Van Nam", "nam@company.com");

        KLTN<Student, Person> kltn1 = new KLTN<>("Smart IoT for Agriculture", st1, tc1);
        KLTN<Student, Person> kltn2 = new KLTN<>("Cybersecurity in Cloud Systems", st2, ad1);

        ListSortable<KLTN<Student, Person>> listKLTN = new ListSortable<>();
        listKLTN.add(kltn1);
        listKLTN.add(kltn2);

        System.out.println("Danh sách các khóa luận sau khi sắp xếp:");
        listKLTN.print();
    }
}
