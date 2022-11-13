import java.util.ArrayList;

public class Department {
    private String name ;

    private ArrayList<Employee> employees = new ArrayList<>() ;
    private ArrayList<Course> courses = new ArrayList<>() ;

    public Department(String name, ArrayList<Employee> employees) { //weil es eine Komposition ist im Konstruktor
        this.name = name ;
        this.employees=employees ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
