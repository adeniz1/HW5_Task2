import java.util.ArrayList;

public class Professor extends Employee {
    private String name;
    private int employeeId;
    private ArrayList<Course> courses = new ArrayList<>();

    public Professor(String name, int employeeId) {
        super(name, employeeId);
    }

    private ArrayList<Exam> exams = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Exam> getExams() {
        return exams;
    }

    public void setExams(ArrayList<Exam> exams) {
        this.exams = exams;
    }

    public void publicCourse() {

    }

    public void assignTA() {

    }

    public void addCourse() {


    }
}
