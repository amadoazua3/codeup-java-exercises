import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);

//        1. Basic Arithmetic

//        System.out.print("First number: ");
//        int num1 = scanner.nextInt();
//
//        System.out.print("Second number: ");
//        int num2 = scanner.nextInt();


//
//        if(num2 == 0){
//            System.out.print("That number is not valid. Please input a new number: ");
//            num2 = scanner.nextInt();
//        }
//
//
//        System.out.println("\n" + num1 + " + " + num2 + " = " + Addition(num1, num2));
//        System.out.println(num1 + " - " + num2 + " = " + Subtraction(num1, num2));
//        System.out.println(num1 + " * " + num2 + " = " + Multiplication(num1, num2));
//        System.out.println(num1 + " / " + num2 + " = " + Division(num1, num2));
//        System.out.println(num1 + " % " + num2 + " = " + Modulus(num1, num2));

//        2. Create a method that validates that the user input is in a certain range

//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

//        3. Calculate the factorial of a number


        System.out.print("Enter a number between 1 and 10: ");

        Factorial(1, 10);

    }

//    public static int Addition(int n1, int n2){
//        return n1 + n2;
//    }
//
//    public static int Subtraction(int n1, int n2){
//        return n1 - n2;
//    }
//
//    public static int Multiplication(int n1, int n2){
//
////        alternative way of multiplication
//
//        int sum = 0;
//
//        for(int i = 1; i <= n1; i++){
//
//            sum = sum + n2;
//        }
//
//        return sum;
//
////        Conventional way of multiplication
////        return n1 * n2;
//    }
//
//    public static double Division(double n1, double n2){
//        return n1 / n2;
//    }
//
//    public static int Modulus(int n1, int n2){
//        return n1 % n2;
//    }

//    2.

//    public static int getInteger(int min, int max){
//
//        Scanner scanner = new Scanner(System.in);
//
//        int n1 = scanner.nextInt();
//
//        if(n1 < min){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            getInteger(1, 10);
//        } else if(n1 > max){
//            System.out.print("Please re-enter a number between 1 and 10: ");
//            getInteger(1, 10);
//        } else {
//            System.out.println(n1 + " is a valid number!");
//        }
//        return n1;
//    }


//    3.


    public static void Factorial(int min, int max){

        while (true) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        if(input < min){
            System.out.print("Please re-enter a number between 1 and 10: ");
            Factorial(1, 10);
        } else if(input > max){
            System.out.print("Please re-enter a number between 1 and 10: ");
            Factorial(1, 10);
        } else {

            long fact = 1;

            for (int i = 1; i <= input; i++) {
                fact = fact * i;
                System.out.println(i + "! = " + fact);
            }

                System.out.print("Would you like to continue? (y/n): ");

                String prompt = scanner.next().toLowerCase();

                if (prompt.equals("y")) {
                    System.out.print("Enter a number between 1 and 10: ");
                    continue;
                } else if (prompt.equals("n")) {
                    break;
                }

            }
            break;
        }
    }



}
