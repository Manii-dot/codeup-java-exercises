package OOPactivity;

import java.util.Scanner;

public class Chess {

    //What is going to go into this bleuprint?

    //Chess numPlayers

    //Chess string representation 8x8

    //ChessPiece objects [] <<< future thought
        //chessPiece object method move()

    //Chess 2d array/matrix

    //Chess method settingUpPieces()

    //Chess method playChess()

    //Chess method chooseSide()


    final int numPlayers = 2;
    String chessBoard = "8x8";
    //chessPiece[] chessPieces = new chessPiece[]; Java3 workshop
    String[] chessPieces = {"Pawn", "Rook", "Knight", "Bishop", "King", "Queen"};

    public void settingUpPieces(){

    };

    public String chooseSide(){
        //Instructions to return a random side or side selection program
        System.out.println("Which side do you want to be [blak or white?]");
        Scanner sc = new Scanner(System.in);

        String sideSelect = sc.nextLine();

      return sideSelect;
    };

    public boolean playChess(){
        //Instruction to run the game of chess
        //pieces abd specific moves
        System.out.println("Are you ready to play a game of chess? y/n");

        Scanner sc = new Scanner(System.in);

        return true;

    }

}
