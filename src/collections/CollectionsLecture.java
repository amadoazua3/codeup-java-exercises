package collections;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();

        // add first element

        stringArr.add("Amado");
        stringArrCopy.add("Amado");

//        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());

        System.out.println(stringArr.get(0));

//        System.out.println(stringArr.hashCode());
        System.out.println(System.identityHashCode(stringArr));
        System.out.println("\n");

        // add second element

        stringArr.add("Haruko");

        // returns true on .equals when the copy and stringArr are compared
        stringArrCopy.add("Haruko");

        // returns false on .equals when the copy and stringArr are compared
//        stringArrCopy.add("Canti");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
        System.out.println(System.identityHashCode(stringArr));
        System.out.println("\n");

        // remove second element

//        stringArr.remove(1);
//        System.out.println(stringArr.hashCode());
//        System.out.println(System.identityHashCode(stringArr));


//        ArrayList<String> stringArrCopy = stringArr;


        System.out.println("Array list copy: ");
        System.out.println(stringArrCopy);
        System.out.println(System.identityHashCode(stringArrCopy));
        System.out.println("\n");

//        stringArrCopy.remove(1);
//        System.out.println(stringArr);

        System.out.println("The array lists are equal: " + stringArr.equals(stringArrCopy));



    }

}
