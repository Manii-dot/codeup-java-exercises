import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        //1
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n.",pi);

        //Explore the Scanner Class
        //1
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to enter here?");
        int number = sc.nextInt();
        System.out.printf("You had enter %d", number);
        //If the user input a string there is an error that happen.



    }
}
