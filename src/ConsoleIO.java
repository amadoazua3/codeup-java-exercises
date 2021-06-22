import java.util.Scanner;

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

        while (sc.hasNext()){
            String word = sc.nextLine();

            if(word.equals("break")){
                break;
            }
            System.out.println(word);
        }






    }

}
