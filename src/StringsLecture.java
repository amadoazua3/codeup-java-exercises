import java.util.Scanner;

public class StringsLecture {

    public static void main(String[] args) {

        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".

        Scanner scanner = new Scanner(System.in);

        String[] studentsArr =
                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
                        "Casey", "Dorian", "Tristan", "Jordy"};
        int randomNum = (int) (Math.random() * 28);

        String randomName = studentsArr[randomNum];

        System.out.print("Please type in your first name: ");

        String fName = scanner.next();

        if(fName.equals(randomName)){
            System.out.println("Woah! you guessed: " + randomName + "! " +
                    "How did you know " + fName + " is my name?!");
        } else {
            System.out.println("Way off my friend! My name isn't " +
                    fName + ". It's " + randomName + ".");
        }

    }

}
