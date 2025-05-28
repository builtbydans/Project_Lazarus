package Part04_02_ObjectsInAList.Book;

public class Book {
    private String title;
    private int pages;
    private String year;

    public Book(String title, int pages, String year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String displayTitleOnly() {
        return this.title;
    }

    @Override
    public String toString() {
        return String.format("%s, %d pages, %s", title, pages, year);
    }
}
