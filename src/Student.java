import java.util.ArrayList;

public class Student {
    private int id ;
    private String name ;

    private ArrayList<Exam> exams=  new ArrayList<>() ;
    private Project project ;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    //Getter und Setter für Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Getter und Setter für Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
