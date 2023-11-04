package Test15;

import task12.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ComparableTest {

    @Test
    public void testCompareTo() {
        Book book1 = new Book("Title1", "Author1", 20, "12345");
        Book book2 = new Book("Title2", "Author2", 30, "67890");
        Book book3 = new Book("Title3", "Author3", 25, "12346");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        assertEquals(book1, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book2, books.get(2));
        assertNotEquals(book3, books.get(0));
        assertNotEquals(book3, books.get(2));
    }
}
