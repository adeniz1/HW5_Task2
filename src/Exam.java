import java.util.ArrayList;

public class Exam {

    private int maxValue ;
    private ArrayList<Student> registeredStudents = new ArrayList<Student>() ;
    private final ArrayList<Question> questions ; //wegen Komposition final

    public Exam(int maxValue, ArrayList<Question> questions){
        this.maxValue=maxValue ;
        this.questions=questions ;

    }
    public void addQuestion(int id,  String task, int value) {
        Question Q = new Question(task,value,id) ;
        questions.add(Q) ;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public boolean register(Student student) {
        boolean b = true;
        for(int i = 0 ; i<registeredStudents.size();i++){
            if(registeredStudents.get(i) == student) {
                b=true ;
            } else {
                b=false ;
            }
        }
        return b ;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int max) {
        this.maxValue = max;
    }

    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setStudents(ArrayList<Student> students) {
        this.registeredStudents = students;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
