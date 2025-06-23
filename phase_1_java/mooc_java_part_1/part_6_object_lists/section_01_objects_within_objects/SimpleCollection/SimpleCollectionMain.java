
public class SimpleCollectionMain {

    public static void main(String[] args) {

        // Try out your class here
        LongestCollection j = new LongestCollection("characters");
        System.out.println(j);        
        
        System.out.println();
        
        j.add("magneto");
        System.out.println(j);
        
        System.out.println();
        
        j.add("mystique");
        System.out.println(j);
        
        System.out.println();
        
        j.add("phoenix");
        System.out.println(j);

        System.out.println();
        System.out.println("The longest name in the list is: " + j.longest());
    }
}
