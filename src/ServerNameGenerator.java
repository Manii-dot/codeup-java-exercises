public class ServerNameGenerator {

    static String[] adjectives = {"mad", "angry","moody", "sad", "painful", "brave", "furious", "fast", "viscious", "depressed"};
    static String[] nouns = {"love", "wife", "husband", "son", "daughter", "baby", "grandparent", "marriage", "life", "union"};

    //method that will return a random element from an array of strings
    public static String randomElement(String[] randomArray){
        int randomEl = (int)(Math.random()*randomArray.length -1 );
        return randomArray[randomEl];
    }

    //Adding a main method
    public static void main(String[] args){

        String adj = randomElement(adjectives);
        String nou = randomElement(nouns);
        System.out.println("Here is your server name:");
        System.out.printf("%s-%s", adj, nou);

    }

}
