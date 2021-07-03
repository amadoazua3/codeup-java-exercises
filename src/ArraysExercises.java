import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        toString(numbers);

        // For loop to print out all items in the array

//        for(int n : numbers){
//            System.out.println(n);
//        }

     String[] Person = new String[3];
     Person[0] = "Haruko";
     Person[1] = "Naota";
     Person[2] = "Ninamori";

     String personElement = "Canti";

     for(String n: Person){
         System.out.println(n);
     }

      addPerson(Person, personElement);

//        System.out.println("Array after adding " + personElement +
//        Arrays.toString());

    }

    private static void toString(int[] numbers) {

        System.out.println(Arrays.toString(numbers));

    }

    static String addPerson(String[] person, String element){

        // this doesnt work just a stopping point for now
        return person + element;

    }

}
