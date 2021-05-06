import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
randomNumberGuess();
    }
    public static void randomNumberGuess(){
    Boolean Guesses = true;
    do{
        //Set up the random number
        int random = (int)(Math.random()*100+1);

        // User input
        System.out.println("Pick a number form 1 to 100");
        Scanner scanner = new Scanner(System.in);
        int userGuess = scanner.nextInt();

        if(userGuess<random){
            System.out.println("You need to go HIGHER");
            Guesses= true;
        }else if(userGuess>random){
            System.out.println("You need to go LOWER");
            Guesses=true;
        }else if(userGuess == random){
            System.out.println("GOOD GUESS");
            Guesses = false;
        }


    }while(Guesses);



    }


}
