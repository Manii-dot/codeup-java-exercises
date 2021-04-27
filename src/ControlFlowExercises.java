import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // Section 1 LOOP BASICS
        //a) while
        int i = 5;
        while (i <= 15){
            System.out.println("the current value of i is " + i);
            i++;
        }

        //b) do While

        //1b
        int a = 0;
        do{
            a += 2;
            System.out.println( "a is "+a);
        }while(a<100);

        //2b
        int b = 105;
        do{
            b = b - 5;
            System.out.println("b is " +b);
        }while(b>-10);

        //3b
        long c = 2;
        do{
            c = c*c;
            System.out.println("Square of c is "+c);
        }while(c<65536);

        //4b
        for(int aa =0; aa<102; aa+=2){
            System.out.println( "aa is "+aa);
        }

        for(int bb =105; bb>-10; bb-=5){
            System.out.println( "bb is "+bb);
        }

        for(long cc =2; cc<1000000; cc*=cc){
            System.out.println( "cc is "+cc);
        }

        // Section 2 Fizzbuzz
        for (int x = 1; x <= 100; x++){
    System.out.println(x);
            if(((x%3)==0 && (x%5)==0))
                System.out.println("fizzbuzz");
            else if((x%3)==0)
                System.out.println("fizz");
            else if((x%5)==0)
                System.out.println("buzz");
        }


        // Section 3 Display a table of powers
        Scanner sc = new Scanner(System.in);
        System.out.println("What number would you like to go up to?");
        int integer = sc.nextInt();
        System.out.printf("Here is your table!\nnumber square  cube \n");
        for(long y =1; y<= integer; y++){
            long y2 = y*y;
            long y3 = y*y*y;

            System.out.printf("%-5d |  %-2d  |  %-2d\n", y, y2, y3);
        }


        // Section 4 Convert given number grades into letter grades.
        System.out.println("Please enter your grade: ");
        int UserGrade = sc.nextInt();










    }
}
