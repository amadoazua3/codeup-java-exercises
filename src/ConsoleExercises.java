import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please input a int: ");
//        int userInput = scanner.nextInt();

//        System.out.println("You entered: " + userInput);

        System.out.println("Please enter 3 words:");
        String sentence = scanner.nextLine();
//        String word1 = scanner.next();
//        String word2 = scanner.next();
//        String word3 = scanner.next();

//        System.out.println(word1 + " " + word2 + " " + word3);
        System.out.println(sentence);

//        System.out.println("Please enter a sentence: ");
//        String sentence = scanner.next();
//        String sentence = scanner.nextLine();
//
//        System.out.println(sentence);


//        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter a number for length: ");
//        float length = scanner.nextFloat();
        int length = scanner.nextInt();

        System.out.println("Please enter a number for width: ");
//        float width = scanner.nextFloat();
        int width = scanner.nextInt();


//        float area = length * width;
        int area = length * width;
//        float perimeter = 2 * (length + width);
        int perimeter = 2 * (length + width);

//        System.out.printf("The area of the room is: %.2f feet \n", area);
        System.out.printf("The area of the room is: %d feet\n", area);
//        System.out.printf("The perimeter of the room is: %.2f feet", perimeter);
        System.out.printf("The perimeter of the room is: %d feet\n", perimeter);
        scanner.close();
    }

}
