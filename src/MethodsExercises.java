public class MethodsExercises {
public static void main(String[] args){
    System.out.println(Addition(2,2));
    System.out.println(Subtraction(2,2));
    System.out.println(Multiplication(2,2));
    System.out.println(Division(2,2));
    System.out.println(Modulus(0,2));
    System.out.println(LoopMultiplication(5,2));

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






}
