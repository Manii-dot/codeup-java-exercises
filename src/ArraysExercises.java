import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] argues){

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person;
        Person = new String[3];

        Person[0] = "Manny";
        Person[1] = "Laura";
        Person[2] = "Adrielle";

        System.out.println("Arrays.toString(Person) = " + Arrays.toString(Person));

        System.out.println();

        for(String family: Person){
            System.out.println(family+" is part of the JoSteph family");
        }
    }

public static addPerson(){

}

}
