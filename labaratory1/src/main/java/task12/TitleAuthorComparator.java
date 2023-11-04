package task12;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        int titleComparation = book1.getTitle().compareTo(book2.getTitle());
        if (titleComparation != 0) return titleComparation;
        return book1.getAuthor().compareTo(book2.getAuthor());
    }
}

