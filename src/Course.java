import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    public ArrayList<TA> getTas() {
        return tas;
    }

    public void setTas(ArrayList<TA> tas) {
        this.tas = tas;
    }

    public Professor[] getProfs() {
        return profs;
    }

    public void setProfs(Professor[] profs) {
        this.profs = profs;
    }

    private  ArrayList<TA> tas = new ArrayList<>() ;
    private  Professor [] profs = new Professor [3] ;

    private TA ta ;
    private Professor prof  ;

    public Professor getProf() {
        return prof;
    }



    public TA getTa() {
        return ta;
    }

    public void setProf(Professor prof) {
        //wenn prof Instanzvariable nicht null ist sollen das Objekt dass in Prof gespeichert ist und das neue übergebene
        //Objekt prof in das Array profs hinzugefügt werden. Falls profs voll ist soll eine Fehlermeldung ausgegeben
        //werden
    }

    public void setTa(TA ta) {
        //  wenn die ta Instanzvariable nicht null ist sollen das Objekt dass in Prof gespeichert ist  und das neue
        //  übergebene Objekt ta in die ArrayList hinzugefügt werden.
    }

    public Course(int id, String name, int maxCapacity, Professor prof) {
        this.id = id;
        this.name = name;
        this.maxCapacity = maxCapacity ;
        this.prof= prof ;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void enroll(Student student) {

    }

    public void apply(TA ta) {


    }
    public void setMaxCap(int max) {
     this.maxCapacity= max ;
    }

}
