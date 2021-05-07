package util;

import java.util.Scanner;

public class Input {

    private Scanner sc = new Scanner(System.in);

    public String getString(){
        return "";
    }

    public boolean yesNo(){
    if( getString().equals("y") || getString().equals("yes")){
        return true;
        }else {
        return false;
        }
    }


    public int getInt(int min, int max){
return 0;
    }

    public int getInt(){
return 0;
    }

    public double getDouble(double min, double max){
return 0;
    }

    public double getDouble(){
return 0;
    }
}
