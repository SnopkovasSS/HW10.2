import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        if (author == null) {
            throw new IllegalArgumentException("Author cannot be null");
        }
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }
    @Override
    public String toString() {
        // Вызываем toString автора, чтобы не дублировать логику
        return "\"" + title + "\", автор: " + author.toString() + ", издан: " + publicationYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

