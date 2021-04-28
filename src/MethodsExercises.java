import java.util.Scanner;

public class MethodsExercises {
public static void main(String[] args){
    System.out.println(Addition(2,2));
    System.out.println(Subtraction(2,2));
    System.out.println(Multiplication(2,2));
    System.out.println(Division(2,2));
    System.out.println(Modulus(0,2));
    System.out.println(LoopMultiplication(5,2));
    System.out.println(getInteger(1,10));
    System.out.println(Factorial());
    }

// 1 Basic Arithmetic
    // a)
    public static double Addition(double num1, double num2){
    double addition = num1 + num2;
    return addition;
    }

    public static double Subtraction(double num1, double num2){
        double subtraction = num1 - num2;
        return subtraction;
    }

    public static double Multiplication(double num1, double num2){
        double multiplication = num1 * num2;
        return multiplication;
    }

    public static double Division(double num1, double num2){
        double division = num1 / num2;
        return division;
    }

    public static double Modulus(double num1, double num2){
        double modulus = num1 % num2;
        return modulus;
        //If you try to divide by zero the reurn will be NaN
    }
    // NEED MORE UNDERSTANDING WITH THAT
    public static double LoopMultiplication(double num1, double num2){
        int result = 0;
        while(num1 > 0){
            result += num2;
            num1--;
        }
        return result;
    }

    // Section 2
    //Create a method that validates that user input is in a certain range

    //
    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int userInput = scanner.nextInt();
        if (userInput > min && userInput < max) {
            System.out.printf("Congrats, your input of %d was within our min and max!\n", userInput);
        }else System.out.print("Please try again it cant be ");
        return userInput;
    }

    //Section 3
    //Calculate the factorial of a number.
    public static int Factorial (){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10");
        long factor = 1;
        int userInput = scanner.nextInt();
        for(int i = 1; i <= userInput; i++){
            factor *= i;
        }

        System.out.printf("!%d = %d", userInput, factor);
        return userInput;
}


    //Section 4
    //




}
