public class ServerNameGenerator {

    static String[] adjectives = {"mad", "angry","moody", "sad", "hurt", "brave", "furious", "fast", "viscious", "depressed"};
    static String[] nouns = {"love", "wife", "husband", "son", "daughter", "baby", "grandparent", "marriage", "life", "union"};

    //method that will return a random element from an array of strings
    public static String randomElement(String[] randomArray){
        int randomEl = (int)(Math.random()*randomArray.length -1 );
        return randomArray[randomEl];
    }

    //Adding a main method


}
