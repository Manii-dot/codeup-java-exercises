package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return scanner.nextLine();
    }

    public boolean yesNo(){
    if( getString().equals("y") || getString().equals("yes")){
        return true;
        }else {
        return false;
        }
    }


    public int getInt(int min, int max){

    }

    public int getInt(){

    }

    public double getDouble(double min, double max){

    }

    public double getDouble(){

    }
}
