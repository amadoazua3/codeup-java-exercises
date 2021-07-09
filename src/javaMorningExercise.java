import java.util.Arrays;
import java.util.Scanner;

public class javaMorningExercise {

//    public static void main(String[] args) {
//
//     //   Create a method that will return how many capital letters are in a string.
//
//        uppercaseCount("HlkeAElkKlW");
//
//    }
//
//    public static void uppercaseCount(String Str){
//
//        int uppercase = 0;
//
//        for(int i = 0; i < Str.length(); i++){
//
//            if(Character.isUpperCase(Str.charAt(i))){
//                uppercase++;
//            }
//
//        }
//        System.out.println("There are " + uppercase + " capital letters in this string.");
//    }


    // TODO: Create a method which will return a String[] containing the user's favorite vacation spots
    //  -> Each time the user inputs a new vacation spot, reset the array to be one element longer in length
    //  -> Then, add the old elements
    //  -> Finally, add the new element
    //  -> When the user decides to finish inputting spots, return the String[].
    //  -> sout out the returned value!

    public static void main(String[] args) {

        String[] locations = {};
        System.out.println("Please input your vacation spot: ");
        System.out.println("Press q anytime to exit");
        System.out.println(Arrays.toString(vacation(input(), locations)));


    }

    public static String input(){

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    public static String[] vacation(String input, String[] locations){


        String[] result = Arrays.copyOf(locations, locations.length + 1);
        result[result.length - 1] = input;

        if(!input.equalsIgnoreCase("q")){
            vacation(input(), result);
        }

        return result;

    }





}
