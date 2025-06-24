import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ToDoList list;

    public UserInterface(Scanner scanner, ToDoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "add":
                    System.out.print("To add: ");
                    String toAdd = scanner.nextLine();
                    list.add(toAdd);
                    break;
                case "list":
                    list.print();
                    break;
                case "remove":
                    System.out.print("Which number to remove?: ");
                    String remove = scanner.nextLine();
                    list.remove(Integer.parseInt(remove));
                    break;
                case "stop":
                    System.out.println("Programmed ended");
                    return;
            }
        }
    }
}
