import java.util.Scanner;

public class ConsoleIOLecture {
    public static void main(String[] args){
        System.out.println("Console IO Lecture");

        //======================================== print() and println()

        // this:
        System.out.println("here");
        System.out.println("there");

        // is equivalent to this:
        System.out.print("here\n");
        System.out.print("there\n");

        //without the newline characters, print output this:
        System.out.print("here");
        System.out.print("there");

        // to concatenate, just like JS:
        String firstName = "Emmanuel";
        String lastName = "Stephen";
        System.out.println(firstName + " " + lastName);


        // ===================================User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String userFirstName = sc.next();
        System.out.printf("Nice to meet you, %s\n", userFirstName);

        System.out.println("How old are you?");
        int age = sc.nextInt();
        System.out.printf("Good to hear you are %d years old.\n", age);

        sc.nextLine();
        System.out.println("Favorite Quote:");
        String favoriteQuote = sc.nextLine();
        System.out.printf("Funny, \"%s\" is my favorite quote too.", favoriteQuote);

    }
}
