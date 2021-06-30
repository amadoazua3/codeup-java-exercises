import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {


        int mysteryNumber = randomNumber();

        while(true) {

            int userNum = userNumber();

            boolean game = guess(mysteryNumber, userNum);

            if(game){
                break;
            }

        }

    }


    public static int randomNumber(){

        Random rand = new Random();
        int upperbound = 100;
        // generate random values from 0-100

        int rando = rand.nextInt(upperbound);

        return rando;
    }

    public static int userNumber(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please pick a number between 1 and 100: ");
        int userInput = scanner.nextInt();

        if(userInput > 100){
            userNumber();
        } else if(userInput < 0){
            userNumber();
        }
            return userInput;

    }

    public static boolean guess(int mysteryNum, int userNum){

        if(userNum > mysteryNum){
            System.out.println("LOWER");
            userNumber();
        } else if(userNum < mysteryNum){
            System.out.println("HIGHER");
            userNumber();
        } else if(userNum == mysteryNum){
            System.out.println("GOOD GUESS!");
            return true;
        }

        return false;
    }



}
