public class ControlFlowExercises {
    public static void main(String[] args) {

        //1 LOOP BASICS
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

    }
}