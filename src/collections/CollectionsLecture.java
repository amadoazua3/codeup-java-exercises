package collections;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>();

        // add first element

        stringArr.add("Amado");

//        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());

        System.out.println(stringArr.get(0));

//        System.out.println(stringArr.hashCode());
        System.out.println(System.identityHashCode(stringArr));

        // add second element

        stringArr.add("Haruko");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr);
//        System.out.println(stringArr.hashCode());
        System.out.println(System.identityHashCode(stringArr));

        // remove second element

        stringArr.remove(1);
//        System.out.println(stringArr.hashCode());
        System.out.println(System.identityHashCode(stringArr));

    }

}
