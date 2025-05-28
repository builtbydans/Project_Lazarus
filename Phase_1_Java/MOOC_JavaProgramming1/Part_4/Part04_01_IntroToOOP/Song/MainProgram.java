package Part04_01_IntroToOOP.Song;

public class MainProgram {
    public static void main(String[] args) {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
