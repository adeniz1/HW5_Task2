import java.util.ArrayList;

public class Project {
    private String name ;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    private Course course ; //da es eine monodirektionale Assoziation zwischen Course und Projekt gibt
                            //gibt es nur eine Variable vom Typ Course in Projekt

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private ArrayList <Student> members = new ArrayList<>();


    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }

    //Konstruktor
    public Project(String name, ArrayList<Student> members) { //wegen Aggregation im Konstruktor
        this.name= name ;
        this.members=members ;
    }

    public void addMembers(Student student) {
        Student s = student ;
        for(int i = 0 ; i<members.size();i++) {
            s= members.get(i) ;
            continue;
        }
        members.add(s) ;
    }

    public ArrayList<Student> getMembers() {
        return members;
    }
}
