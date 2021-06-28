import org.w3c.dom.ls.LSOutput;

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

//
//        String colors = "Red Orange Blue Yellow Green Purple";
//
//        System.out.print("What is your favorite color: ");
//
//        String input = scanner.next();
//
//        if(colors.startsWith(input)) {
//            System.out.println("My fave color: " + input + " is the first one!");
//        } else if(colors.endsWith(input)){
//            System.out.println("My fave color: " + input + " is last...");
//        } else {
//            System.out.println("I don't know that color...");
//        }

//        System.out.print("Enter in a basketball team: ");
//        String team = scanner.nextLine();
//        basketballTeam(team);

//       Name and Age mini exercise

        System.out.print("What is your first name: ");
        String first = scanner.next();

        System.out.print("What is your last name: ");
        String last = scanner.next();

        System.out.print("How old are you: ");
        String age = scanner.next();

        System.out.println(fullName(first, last));
        System.out.println(age(age));

    }

//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.

//        public static void basketballTeam(String s){
//
//            String ballTeam = s + " is the best team!";
//            System.out.println(ballTeam);
//
//            counter(ballTeam);
//        }


//    TODO: create a new method that accepts the string created from the
//     first method and returns the number of characters in that string.
//
//        public static void counter(String str){
//
//            System.out.println("With white spaces the number of characters is " + str.length());
//
//            int count = 0;
//
//            for(int i = 0; i < str.length(); i++){
//                if(str.charAt(i) != ' '){
//                    count++;
//                }
//
//
//            }
//            System.out.println("Without white spaces the number of characters is " + count);
//        }

//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";
//       - accepts: your age. returns: "that's crazy! you don't look
//        100 years old!"

        public static String fullName(String str1, String str2){

            String greeting = "Hello " + str1 + " " + str2 + "!";

            return greeting;
        }

        public static String age(String str){

            String wow = "Wow! That's crazy! You don't look " + str + " years old!";

            return wow;

        }


}
