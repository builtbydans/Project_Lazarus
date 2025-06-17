
public class Book2 {

    private String name;
    private int publicationYear;

    public Book2(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Book2)) {
            return false;
        }

        Book2 comparedBook = (Book2) compared;

        return this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear;
    }

}
