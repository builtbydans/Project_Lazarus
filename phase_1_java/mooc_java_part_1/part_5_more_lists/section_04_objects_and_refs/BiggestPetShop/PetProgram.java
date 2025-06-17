
import java.util.Scanner;

public class PetProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pet hulda = new Pet("Molly", "Golden retriever");
        PetPerson leo = new PetPerson("Leo", hulda);

        System.out.println(leo);
    }
}
