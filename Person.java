package th2allotherclasses;

/**
 *
 * @author emanuela
 */
public class Person {

    String name;
    Book book; // Aggregation - reference held, some ownership but the Book class will go on if the Person object dies
    Heart heart = new Heart(44, HeartBeat.PITTERPATTER);  // Composition - this class owns the heart class and if the Person class dies, so does the heart.
    
    public Person(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void putBookOnBookshelf(Bookshelf shelf) { // No relation between Bookshelf class and person class.
        shelf.addBookToBookshelf(this.book);                   
        this.book = null;
    }

    public void retrieveBookFromBookshelf(String title, Bookshelf shelf) {
        this.book = shelf.retrieveBookFromBookshelf(title);
    }

    public String whatBookDoIHave() {
        if (this.book != null) {
            return this.name + " has the book: " + this.book.getTitle();
        } else {
            return this.name + " has no book.";
        }
    }

    public void makeHeartPump() {
        this.heart.oneMinute();
    }
}
