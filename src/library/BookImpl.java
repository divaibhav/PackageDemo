package library;

public class BookImpl {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Five point someone";
        book.isbn = 1236454564645464L;
        book.yearOfPublishing = "2005";

        book.display();
    }
}
