package task12;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2){
        int authorComparation = book1.getAuthor().compareTo(book2.getAuthor());
        if (authorComparation != 0) return authorComparation;
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
