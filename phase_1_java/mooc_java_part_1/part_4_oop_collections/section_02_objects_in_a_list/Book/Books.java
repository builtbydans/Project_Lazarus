package Part04_02_ObjectsInAList.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Publication Year: ");
            String year = scanner.nextLine();

            books.add(new Book(title, pages, year));
        }

        while (true) {
            System.out.print("What information will be printed? ");
            String search = scanner.nextLine();

            if (search.equalsIgnoreCase("everything")) {
                for (Book book : books) {
                    System.out.println(book);
                }
                break;
            } else if (search.equalsIgnoreCase("name")) {
                for (Book book : books) {
                    System.out.println(book.displayTitleOnly());
                }
                break;
            } else {
                System.out.println("Invalid query. Please type 'everything' or 'name'.");
            }
        }
    }
}
