public class Book {
    private String name;
    private String author;
    private BookType type;

    public Book(String name, String author, BookType type) {
        this.name = name;
        this.author = author;
        this.type = type;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    enum BookType {
        Boevik,
        Melodrama,
        Yjasu
    }
}