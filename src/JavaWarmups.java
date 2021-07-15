import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class JavaWarmups {

    // Java warmup for 7/14/2021

//    public static void main(String[] args) {
//
//        String strExample = "A B C D E F G";
//
//        String strExp = "Erik Moses Chris Amado CyberPunk2077-GameOfTheYear";
//
//        System.out.println(stringy(strExample));
//        System.out.println(stringy(strExp));
//
//    }
//
//    public static String stringy(String str){
//
//        String[] splitty = str.split(" ");
//
//        return Arrays.toString(splitty);
//
//    }


    // Java warmup for 7/15/2021

//WARM UP
// TODO Given this string: `String str = "Oberon is the
//  best cohort ever!"`,  that generates
//  a number between 0 and 50 and print out the character from that
//  string using a random number generator. Using a try/catch block, handle
//  any errors (Exceptions) that may occur by printing out the
//  message.

    public static void main(String[] args) {

        String str = "Oberon is the best cohort ever!";

        randomGenerator(str);

    }

    public static void randomGenerator(String str){

        Random random = new Random();

        int upperLimit = 50;

        int rando = random.nextInt(upperLimit);

        try{

            System.out.println("Character is: " + str.charAt(rando));

        } catch (StringIndexOutOfBoundsException e){

            System.out.println("Random was " + rando + "\nString has indexes of " + str.length());
            System.out.println("Error was " + e.getMessage());
            System.out.println("Rerunning the program: \n\n");
            randomGenerator(str);

        }

    }






}
