package Test16;

import task12.Book;
import task12.TitleComparator;
import task12.TitleAuthorComparator;
import task12.AuthorTitleComparator;
import task12.AuthorTitlePriceComparator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookComparatorTest {

    @Test
    public void testTitleComparator() {
        Book book1 = new Book("Title2", "Author1", 20, "12345");
        Book book2 = new Book("Title1", "Author2", 30, "67890");
        Book book3 = new Book("Title3", "Author3", 25, "12346");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Сортируем список с использованием TitleComparator
        Collections.sort(books, new TitleComparator());

        // Проверяем, что книги отсортированы по названию
        assertEquals(book2, books.get(0));
        assertEquals(book1, books.get(1));
        assertEquals(book3, books.get(2));
    }

    @Test
    public void testAuthorTitleComparator() {
        Book book1 = new Book("Title2", "Author1", 20, "12345");
        Book book2 = new Book("Title1", "Author2", 30, "67890");
        Book book3 = new Book("Title3", "Author3", 25, "12346");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Сортируем список с использованием AuthorTitleComparator
        Collections.sort(books, new AuthorTitleComparator());

        // Проверяем, что книги отсортированы по автору, а затем по названию
        assertEquals(book1, books.get(0));
        assertEquals(book2, books.get(1));
        assertEquals(book3, books.get(2));
    }
    @Test
    public void testTitleAuthorComparator() {
        Book book1 = new Book("B2", "Author1", 20, "12345");
        Book book2 = new Book("B1", "Author2", 30, "67890");
        Book book3 = new Book("B1", "Author3", 25, "12346");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Сортируем список с использованием TitleAuthorComparator
        Collections.sort(books, new TitleAuthorComparator());

        // Проверяем, что книги отсортированы сначала по названию, а затем по автору
        assertEquals(book2, books.get(0));
        assertEquals(book3, books.get(1));
        assertEquals(book1, books.get(2));
    }
    @Test
    public void testAuthorTitlePriceComparator() {
        Book book1 = new Book("B", "Author1", 10, "123");
        Book book2 = new Book("A", "Author1", 20, "456");
        Book book3 = new Book("A", "Author1", 15, "789");

        List<Book> books = Arrays.asList(book1, book2, book3);
        books.sort(new AuthorTitlePriceComparator());

        Book[] expectedOrder = {book3, book2, book1};
        assertArrayEquals(expectedOrder, books.toArray());
    }
}
