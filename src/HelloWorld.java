public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // 1 Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 88;
        System.out.println(myFavoriteNumber);

        // 2 Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello";
//        myString = 'c';
//        myString = 3.14159;
        System.out.println(myString);

        // 3 Change your code to assign a character value to myString. What do you notice?
            //When trying to reasign the character value it would not accept it.

        // 4 Change your code to assign the value 3.14159 to myString. What happens?
        // Same thing as the last exercise it would not accept it.

        // 5 Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
          //long myNumber;
            //myNumber = 3.14;
            //myNumber = 123L;
            //myNumber = 123;
//        System.out.println(myNumber);
        //java: variable myNumber might not have been initialized

        //6 Change your code to assign the value 3.14 to myNumber. What do you notice?
        // it gives an error of incompatible types: possible lossy conversion from double to long

        //7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.


        // 8 Change your code to assign the value 123 to myNumber.
        //
        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // the value is supposed to be a float instead of long or int for 3.14

        //9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        //float myNumber = 3.14;    there is an error that happened when trying to get it to work.
        double myNumber = 3.14;     // assigning the double as the declaration is the fix for the number range.
    }
}
