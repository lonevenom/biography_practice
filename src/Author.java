import java.util.ArrayList;
import java.util.List;

public class Author {

    public static final String askAuthorFirstName = "What is your favorite author's first name?";
    public static final String askAuthorLastName = "What is your favorite author's last name?";
    public static final String askAuthorLocation = "Where is your favorite author from?";
    public static final String askAuthorAliveOrDead = "Is your favorite author alive? (Y/N)";
    public static final String askAuthorAge = "How old is your favorite author";


    /**
     * WORK ON BOOK CLASS FIRST
     * Create a custom constructor that will take 6 args and defines the Author object
     * Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE
    public Author(String firstName, String lastName, String country, String isAlive, int age, ArrayList<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.age = age;
        this.books = books;
    }

    public Author(String firstName, String lastName, String country, String isAlive, List<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.books = books;
    }

    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public String isAlive;
    public int age;
    public List<Book> books;


    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE
    @Override
    public String toString() {
        if (isAlive.equalsIgnoreCase("true")) {
            return "Author's information = Author{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country +
                    ", isAlive=" + isAlive +
                    ", age=" + age + "}\n" +
                    "Author's books are as listed below:";
        } return "Author's information = Author{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", country='" + country +
                    ", isAlive=" + isAlive + "}\n" +
                    "Author's books are as listed below:";
    }
}
