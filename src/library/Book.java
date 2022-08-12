package library;

public class Book {
    String title;
    long isbn;
    String yearOfPublishing;

    void display(){
        System.out.println("title = " + title);
        System.out.println("isbn = " + isbn);
        System.out.println("yearOfPublishing = " + yearOfPublishing);
    }
}
