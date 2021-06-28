import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number: ");
        int num1 = scanner.nextInt();

        System.out.print("Second number: ");
        int num2 = scanner.nextInt();

        if(num2 == 0){
            System.out.print("That number is not valid. Please input a new number: ");
            num2 = scanner.nextInt();
        }


        System.out.println("\n" + num1 + " + " + num2 + " = " + Addition(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Subtraction(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Multiplication(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Division(num1, num2));
        System.out.println(num1 + " % " + num2 + " = " + Modulus(num1, num2));

    }

    public static int Addition(int n1, int n2){
        return n1 + n2;
    }

    public static int Subtraction(int n1, int n2){
        return n1 - n2;
    }

    public static int Multiplication(int n1, int n2){

//        alternative way of multiplication

        int sum = 0;

        for(int i = 1; i <= n1; i++){

            sum = sum + n2;
        }

        return sum;

//        Conventional way of multiplication
//        return n1 * n2;
    }

    public static double Division(double n1, double n2){
        return n1 / n2;
    }

    public static int Modulus(int n1, int n2){
        return n1 % n2;
    }

}
