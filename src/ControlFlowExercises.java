import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        1.(A)

//        int i = 5;
//
//        while(i <= 15){
//
//            System.out.printf("i: %d\n", i);
//            i++;
//        }

//        2.(A)

//        int num = 0;
//
//        do{
//
//            System.out.printf("num is: %d\n", num);
//            num += 2;
//
//        }while(num <= 100);

//        2.(B)

//        int num = 100;
//        do{
//            System.out.printf("num is: %d\n", num);
//            num -= 5;
//
//        }while(num >= -5);

//        2.(C)

/* Due to the range of int the following sequence produced is

                    2
                    4
                    16
                    256
                    65536
                    0
And then it remains zero. Note that it never rises above 1000000.

With a long, the number after 65536 would be 4294967296
(which does not fit in an int, but does fit in a long), so it stops. */

//        long num = 2;
//
//        do{
//
//            System.out.printf("num is: %d\n", num);
//            num *= num;
//
//        }while(num < 1000000);




    }
}
