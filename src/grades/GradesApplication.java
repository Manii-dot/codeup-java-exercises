package grades;
import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args){

        HashMap<String, String> students = new HashMap<>();
        Student Salim = new Student("Salim");
        Salim.addGrade(100);
        Salim.addGrade(80);
        Salim.addGrade(90);
        Salim.addGrade(95);

        Student Nathan = new Student("Nathan");
        Nathan.addGrade(100);
        Nathan.addGrade(90);
        Nathan.addGrade(90);
        Nathan.addGrade(98);

        Student Shanshan = new Student("Shanshan");
        Shanshan.addGrade(100);
        Shanshan.addGrade(100);
        Shanshan.addGrade(100);
        Shanshan.addGrade(100);

        Student Jonathan = new Student("Jonathan");
        Jonathan.addGrade(100);
        Jonathan.addGrade(100);
        Jonathan.addGrade(100);
        Jonathan.addGrade(100);

        students.put("Salim", Salim);
    }







}
