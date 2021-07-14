import java.util.Arrays;

public class JavaWarmups {

    public static void main(String[] args) {

        String strExample = "A B C D E F G";

        String strExp = "Erik Moses Chris Amado CyberPunk2077-GameOfTheYear";

        System.out.println(stringy(strExample));
        System.out.println(stringy(strExp));

    }

    public static String stringy(String str){

        String[] splitty = str.split(" ");

        return Arrays.toString(splitty);

    }

}
