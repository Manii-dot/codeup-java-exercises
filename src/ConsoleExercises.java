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
        System.out.printf("You had enter %d\n", number);
        //If the user input a string there is an error that happen.

        //2
        System.out.println("What are your three favorite fruits?");
        String fruit1 = sc.next();
        String fruit2 = sc.next();
        String fruit3 = sc.next();
        System.out.printf("Your three favorite fruits are %s, %s, and %s,\n", fruit1, fruit2, fruit3);
// it will not display anything if you try to enter less than three items, and also if more than three items are entered only the first three items will displayed.

        //3
        sc.nextLine();
        System.out.println("Tell me something cool");
        String somethingCool = sc.nextLine();
        System.out.printf("Wow, \"%s\" is cool\n", somethingCool);
        // when trying to do it with the next method, only the first item is entered.

        //Calculate the perimeter and area of Codeup's classrooms.
        //1
        System.out.println("Give me the width and length of your current space");
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
//        System.out.printf("You have entered %d for width, and %d for the length\n", width, length);
        int area = length * width;
        int parameter = (length*2)+(width*2);

        System.out.printf("The area of this rectangle is %d and its parameter is %d\n",area, parameter);



        //Bonus


    }
}
