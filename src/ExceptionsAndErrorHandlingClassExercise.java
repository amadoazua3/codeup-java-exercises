import java.util.Scanner;

public class ExceptionsAndErrorHandlingClassExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int patronAge = scanner.nextInt();

        System.out.print("Starting deposit: $");
        double startDeposit = scanner.nextDouble();

        System.out.println(eligbilityResult(eligbilityCheck(patronAge, startDeposit)));



    }

    public static String eligbilityCheck(int age, double deposit){

        String status = "pending";

        if(age > 16 && deposit >= 200.00){
            status = "approved";
            return status;
        } else if(age <= 16 || deposit < 199.99){
            status = "denied";
            return status;
        }


        return status;

    }



    public static String eligbilityResult(String str){


        if(str.equals("approved")){
            return "Congratulations! You are approved for an account with Banco di Laura.";
        } else if(str.equals("denied")){
            return "Sorry, but you do not meet the requirements to open an account with Banco di Laura.";
        }


        return str;
    }






}
