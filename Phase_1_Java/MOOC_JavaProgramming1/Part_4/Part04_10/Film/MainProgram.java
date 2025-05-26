package Part04_10.Film;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);
        Film exorcist = new Film("The Exorcist", 18);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age1 = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age1 >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }

        System.out.println("How old are you?");
        int age2 = Integer.valueOf(reader.nextLine());

        if (age2 >= exorcist.ageRating()) {
            System.out.println("You may watch the film " + exorcist.name());
        } else {
            System.out.println("You may not watch the film " + exorcist.name());
        }
    }
}
