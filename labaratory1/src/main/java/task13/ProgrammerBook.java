package task13;
import java.util.Objects;
import task12.Book;
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String isbn,String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }
    public String getLanguage(){

        return this.language;
    }
    public int getLevel(){

        return this.level;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false; // Вызов equals() из родительского класса

        ProgrammerBook that = (ProgrammerBook) obj;

        if (level != that.level) return false;
        return language != null ? language.equals(that.language) : that.language == null;
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),language,level);
    }
    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price=" + getPrice() +
                ", edition=" + getEdition() +
                ", language='" + language + '\'' +
                ", level=" + level +
                '}';
    }

}
