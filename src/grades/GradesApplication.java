package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {



    public static void main(String[] args) {

        printStudent(getStudents());

    }

    public static HashMap<String, Student> getStudents(){

        HashMap<String, Student> studentList = new HashMap<>();

        studentList.put("AkiShine60", getStudent("Amado", new int[] {98, 95, 94}));

        studentList.put("FlintLock_14", getStudent("Moses", new int[]{92, 91, 95}));

        studentList.put("Fame", getStudent("Jesse", new int[]{98, 91, 87}));

        studentList.put("Champagnepp", getStudent("Erik", new int[]{94, 91, 85}));

        return studentList;
    }

    public static Student getStudent(String name, int[] grades){

        Student student = new Student("Amado");

        for (int i = 0; i < grades.length; i++) {
            student.addGrade(grades[i]);
        }
        return student;
    }

    public static void printStudent(HashMap<String, Student> students){

        System.out.print("Enter a github username: ");
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        if(students.containsKey(userInput)){
            Student student = students.get(userInput);
            System.out.println(student.getName());
            System.out.println(student.getGradeAverage());
            System.out.println("Would you like to search again? (y/n)");
            userInput = sc.nextLine();
            if(userInput.equalsIgnoreCase("y")){
                printStudent(students);
            }
        } else {
            System.out.println("User does not exist!");
            printStudent(students);
        }

    }

}
