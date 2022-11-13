import javax.print.DocFlavor;
import java.util.ArrayList;

public class TA {
    private ArrayList<Course> courses = new ArrayList<>() ;
    private ArrayList<Exam> exams= new ArrayList<Exam>() ;
    private Course course ;

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Konstruktor
    public TA(String name) {
       this.name = name ;
    }

    public Course getCourse() {
        return this.course ;
    }

    public void setCourse(Course course) {
        this.course = course;
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

    public void extendContract(Course course)  {

    }
}
