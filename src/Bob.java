import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please make a username: ");
        String handle = scanner.nextLine();


        System.out.println("Meet Bob, He is a lackadaisical teenager.\n" +
                "Please, have a conversation with Bob.\n" +
                "Ask him questions, share your enthusiasm, or say nothing.\n\n");

        while(true) {

            System.out.print(handle + ": ");

            String chat = scanner.nextLine();

            if(chat.contains("?")){
                System.out.println("Bob: Sure");
            } else if (chat.contains("!")){
                System.out.println("Bob: Whoa, chill out!");
            } else if(chat.isEmpty()){
                System.out.println("Bob: Fine. Be that way!");
            } else if(chat.equals("break")){
                break;
            } else {
                System.out.println("Bob: Whatever...");
            }
        }

    }

}
