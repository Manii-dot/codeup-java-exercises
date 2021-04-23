public class ConsoleIOLecture {
    public static void main(String[] args){
        System.out.println("Console IO Lecture");

        //======================================== print() and println()

        // this:
        System.out.println("here");
        System.out.println("there");

        // is equivalent to this:
        System.out.print("here\n");
        System.out.print("here\n");

        //without the newline characters, print output this:
        System.out.print("here");
        System.out.print("here");

        // to concatenate, just like JS:
        String firstName = "Emmanuel";
        String lastName = "Stephen";
        System.out.println(firstName + " " + lastName);


    }
}
