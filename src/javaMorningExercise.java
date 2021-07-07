public class javaMorningExercise {

    public static void main(String[] args) {

     //   Create a method that will return how many capital letters are in a string.

        uppercaseCount("HlkeAElkKlW");

    }

    public static void uppercaseCount(String Str){

        int uppercase = 0;

        for(int i = 0; i < Str.length(); i++){

            if(Character.isUpperCase(Str.charAt(i))){
                uppercase++;
            }

        }
        System.out.println("There are " + uppercase + " capital letters in this string.");
    }

}
