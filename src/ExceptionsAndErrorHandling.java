public class ExceptionsAndErrorHandling {

    // We can throw an exception!
     public static void main(String[] args)throws Exception{
         throw new Exception("This has broken down! Exception!");

        // System.out.println("We wil see this? probably not");// throwing a generic exception: will break our application!

         // a nice code down here


//         try {
//             System.out.println("Let see...");
//             int result = 1/0;
//             System.out.println("I can divide by xero!");
//             System.out.println("result = " + result);
//         }catch(ArithmeticException e){
//             System.out.println("user attempted to divide by Zero");
//         }

         //An example of array
         int[] numbers = {1, 2, 3};
         int x;

         try {
             x = numbers[100];
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Caught an array index exception!");
         } catch (Exception e) {
             System.out.println("Caught a generic exception!");
         } finally {
             System.out.println("This will always run.");
         }


         // Real life scenario



     }



}
