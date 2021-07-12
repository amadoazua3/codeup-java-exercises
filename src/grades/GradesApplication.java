package grades;

import java.util.HashMap;

public class GradesApplication extends Student {



    public GradesApplication(String name) {
        super(name);
    }

    public static void main(String[] args) {

        HashMap<Student, String> students = new HashMap<>();

        students.put(new Student("Amado"), "AkiShine60");

        System.out.println(students);






    }


}
