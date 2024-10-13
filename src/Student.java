import java.util.ArrayList;
import java.util.List;

public class Student {
    private int rating;
    private String name;

    public static List<Student> students = new ArrayList<Student>();

    public static void main(String[] args) {

        Student firstStudent = new Student("Alice");
        Student secondStudent = new Student("Margaret");
        Student thirdStudent = new Student("Zoey");

        firstStudent.setRating(55);
        secondStudent.setRating(70);
        thirdStudent.setRating(91);

        System.out.println(getAvgRating());

        secondStudent.changeRating(73);

        System.out.println(getAvgRating());
    }

    public Student(String name) {
        this.name = name;
        students.add(this);
    }

    public Student() {
    }

    public static double getAvgRating() {
        int sumRating = 0;
        for (int i = 0; i < students.size(); i++) {
            sumRating += students.get(i).getRating();
        }
        return students.size() != 0 ? (double) sumRating / students.size() : 0.0d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean betterStudent(Student student) {
        return this.getRating() > student.getRating();
    }

    public void changeRating(int rating) {
        this.rating = rating;
        getAvgRating();
    }

    public static void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Student{name = '" + name + "', rating = " + rating + '}';
    }
}