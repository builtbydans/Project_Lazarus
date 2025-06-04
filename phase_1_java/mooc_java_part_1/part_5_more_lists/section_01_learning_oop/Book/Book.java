/*
 * 🧩 Java Class Creation Checklist
 * - [ ] Choose a meaningful class name (PascalCase)
 * - [ ] Place the class in the correct package
 * - [ ] Add the appropriate access modifier (public / default)
 * - [ ] Define private fields (consider final if immutable)
 * - [ ] Add constructor(s) to initialize fields
 * - [ ] Include getters and setters if needed (or use Lombok)
 * - [ ] Write methods that match the class's responsibility
 * - [ ] Override toString(), equals(), and hashCode() if needed
 * - [ ] Avoid tight coupling — consider interfaces where possible
 * - [ ] Create a matching test class with basic tests
 */


public class Book {
    private String author;
    private String name;
    private int pages;

    public Book(String author, String name, int pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return String.format("%s, %s, %d pages", author, name, pages);
    }
}
