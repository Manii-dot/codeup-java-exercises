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
        double myNumber = 3.14F;     // assigning the double as the declaration is the fix for the number range.

        // 10
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        //What is the difference between the above code blocks? Explain why the code outputs what it does.
        // it seems like when assigning the +1 after the value it doesnt do nothing, and then printing it out the second time displayed the increment portion of the value. The second code block has the increment assign to the value at the biginning therefore executed then.

        // 11 Try to create a variable named class. What happens?
        // String class; the error 'not a statement' is displayed

        // 12 Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        // I am not sure what is going to happen. But from the looks of it I think some sort of error will happen.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // the result with the error came. but the display is far from my understanding.
        //Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        //	at HelloWorld.main(HelloWorld.java:63)

//        int three = (int) "three"; java: incompatible types: java.lang.String cannot be converted to int

        // 13 Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);



        //14 What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.

// An error would still happen saying something along the way that it is not being assigned to the right variable component.
        int z = Integer.MAX_VALUE;
        z+=1;
        System.out.println("z= "+ z);
    }
}
