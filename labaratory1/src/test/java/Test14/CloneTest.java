package Test14;

import task12.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CloneTest {

    @Test
    public void test() {
        Book originalBook = new Book("Looking for Alaska", "Harry Qubert", 20, "12345");
        Book clonedBook = (Book) originalBook.clone();

        assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook, clonedBook);

        assertEquals(originalBook.hashCode(), clonedBook.hashCode());
        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
        assertEquals(originalBook.getEdition(), clonedBook.getEdition());
        assertEquals(originalBook.getIsbn(), clonedBook.getIsbn());
    }
}
