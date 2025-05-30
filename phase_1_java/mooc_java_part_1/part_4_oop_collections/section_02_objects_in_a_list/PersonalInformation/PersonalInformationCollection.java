
package Part04_02_ObjectsInAList.PersonalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification Number: ");
            String id = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, id));

        }

        for (PersonalInformation pi : infoCollection) {
            System.out.println();
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}
