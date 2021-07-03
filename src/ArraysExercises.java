import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        toString(numbers);

        // For loop to print out all items in the array

//        for(int n : numbers){
//            System.out.println(n);
//        }

    }

    private static void toString(int[] numbers) {

        System.out.println(Arrays.toString(numbers));
    }

}
