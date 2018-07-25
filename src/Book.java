public class Book extends Product {

    private String author;//author
    private int pages;

    public Book() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public int getPages() {

        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}