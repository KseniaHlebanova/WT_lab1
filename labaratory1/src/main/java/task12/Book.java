package task12;

import java.util.Objects;

public class Book implements Cloneable, Comparable<Book> {
    private String title;
    private String author;
    private int price;
    private static int edition;
    private String isbn;

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public String getTitle(){

        return this.title;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public int getPrice(){

        return this.price;
    }
    public static int getEdition()
    {
        return edition;
    }
    public String getIsbn(){

        return this.isbn;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;

        if (price != other.price) return false;
        if (title != null ? !title.equals(other.title) : other.title != null) return false;
        if (author != null ? !author.equals(other.author) : other.author != null) return false;
        return edition == other.edition;
    }
    @Override
    public int hashCode() {
        return Objects.hash(title,author,price,edition);
    }
    @Override
    public Object clone(){
        Object book = new Book(this.title, this.author, this.price, this.isbn);
        return book;
    }

    @Override
    public int compareTo(Book book){
        return this.isbn.compareTo(book.getIsbn());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", edition=" + edition +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}