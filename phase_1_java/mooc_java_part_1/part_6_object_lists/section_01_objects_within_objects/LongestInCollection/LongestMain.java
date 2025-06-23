
public class LongestMain {

    public static void main(String[] args) {


        // Try out your class here
        LongestCollection c = new LongestCollection("characters");
        System.out.println("Pisin: " + c.longest());
        
        c.add("magneto");
        c.add("mystique");
        c.add("phoenix");
        
        System.out.println("Longest: " + c.longest());

        
    }
}
