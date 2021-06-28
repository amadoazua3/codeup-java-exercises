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

//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//
//        String randomName = studentsArr[randomNum];
//
//        System.out.print("Please type in your first name: ");
//
//        String fName = scanner.next();
//
//        if(fName.equals(randomName)){
//            System.out.println("Woah! you guessed: " + randomName + "! " +
//                    "How did you know " + fName + " is my name?!");
//        } else {
//            System.out.println("Way off my friend! My name isn't " +
//                    fName + ". It's " + randomName + ".");
//        }


//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last, then print out "my fave color: userColor is last"


        String colors = "Red Orange Blue Yellow Green Purple";

        System.out.print("What is your favorite color: ");

        String input = scanner.next();

        if(colors.startsWith(input)) {
            System.out.println("My fave color: " + input + " is the first one!");
        } else if(colors.endsWith(input)){
            System.out.println("My fave color: " + input + " is last...");
        } else {
            System.out.println("I don't know that color...");
        }

    }

}
