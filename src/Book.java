import java.util.List;

public class Book {

    public static final String askToEnterBook = "Would you like to enter book info? (Y/N)";
    public static final String askBookName = "What is the name of the book?";
    public static final String askBookGenre = "What is the genre of the book";
    public static final String askBookPages = "How many pages does book have?";

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE
    public Book(String book, String genre, int pages) {
        this.book = book;
        this.genre = genre;
        this.pages = pages;
    }


    //Define instance variables here
    //YOUR CODE HERE
    public String book;
    public String genre;
    public int pages;



    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Book{" +
                "name='" + book + '\'' +
                ", genre=" + genre +
                ", pages=" + pages +
                '}';
    }


}
