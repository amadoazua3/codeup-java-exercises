
import java.util.Scanner;
import java.lang.*;
import java.io.IOException;

public class ConsoleIO {

    public static void main(String[] args) {

//        String name = "Amado";
//        String role = "student";
//        int age = 30;
//        String mySentence = String.format("My name is %s and I am an %s. \nI am %s", name, role, age);
//
//        System.out.println(mySentence);

//        float currencyInPennies = 1000.00f;
//
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies);

        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your first name");
//        String firstName = sc.next();
//        String lastName = sc.next();
//        System.out.printf("You entered: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);


    /* TODO: use the scanner to take in the name of the month you were born and print it back out
        - remember to first prompt the user for the input
     */

//        System.out.println("Enter a number: ");
//        int myNum = sc.nextInt();
//        System.out.println(myNum);

//        while (sc.hasNext()){
//            String word = sc.nextLine();
//
//            if(word.equals("break")){
//                break;
//            }
//            System.out.println(word);
//        }

        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

        String user1 = "Erik";
        String user2 = "Moses";
        String user3 = "Amado";

//        System.out.println("Please input a new username: ");

//        String userInput = sc.next();

//        if(userInput.equals(user1) || userInput.equals(user2) || userInput.equals(user3)){
//            System.out.println("Sorry this username already exists.");
//        }else {
//            System.out.println("You have a valid username.");
//        }


        //TODO: refactor your code from the previous mini exercise into a switch statement

//
//        switch(userInput){
//
//            case "Erik":
//                System.out.println("Sorry this username already exists.");
//                break;
//            case "Moses":
//                System.out.println("Sorry this username already exists.");
//                break;
//            case "Amado":
//                System.out.println("Sorry this username already exists.");
//                break;
//            default:
//                System.out.println("You have a valid username.");
//                break;
//        }

        //TODO: using previous mini exercise, allow the user to input a new username several times until a unique username is entered.

        while(true) {

            System.out.println("Please input a new username: ");
            String userInput = sc.next();

            if (userInput.equals(user1) || userInput.equals(user2) || userInput.equals(user3)) {
                System.out.println("Please enter a unique ");
            }else{
                System.out.printf("Hello, %s", userInput);
                break;
            }

        }

    }

}
