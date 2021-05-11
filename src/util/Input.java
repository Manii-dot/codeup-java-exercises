package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String getString(){
        scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        scanner = new Scanner(System.in);
        String userInput = scanner.next();
    if( getString().equals("y") || getString().equals("yes")){
        return true;
        }else {
        return false;
        }
    }


    public int getInt(int min, int max){
        System.out.println("enter a "+min+" number and a "+max+" number");
        int userInput = scanner.nextInt();
        if(userInput>min && userInput<max){

        }
        return 0;
    }


    public double getDouble(double min, double max){
        System.out.println("enter a "+min+" number and a "+max+" number");
        double userInput = scanner.nextInt();
        if(userInput>min && userInput<max){

        }
return 0;
    }


}
