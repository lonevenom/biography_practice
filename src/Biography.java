import java.util.Scanner;
import java.util.ArrayList;


public class Biography {
    public static void main(String[] args) {

        /**
         * WORK ON BOOK AND AUTHOR CLASSES FIRST
         This will be our actual program that we define author and his books
         In this program we will write the biography of Stefan Zweig, an Austrian novelist.


         Write a program that will get information from user and
         -Print information for the favorite author
         -Print information of the books of favorite author

         Full name = Stefan Zweig
         County = Austria
         Is still alive: No (28 November 1881 – 22 February 1942)
         Some of his books as listed below:

         BookName                            Genre           TotalPage
         Amok                                tale            189
         The Royal Game                      novella         53
         24 Hours in the Life of a Woman     novella         80
         */

        /*
        Expected result:
        Author's information = Author{firstName='Stefan', lastName='Zweig', country='Austria', isAlive=false}
        Author's books are as listed below:
        Book{name='Amok', genre:'tale', page=189}
        Book{name='The Royal Game', genre='novella', page=53}
        Book{name='24 Hours in the Life of a Woman', genre='novella', page=80}
         */

        //YOUR CODE HERE
        Scanner userInput = new Scanner(System.in);
        ArrayList<Book> Books = new ArrayList<>();
        ArrayList<Author> Authors = new ArrayList<>();
        int age = 0;

        System.out.println(Author.askAuthorFirstName);
        String firstName = userInput.next();

        System.out.println(Author.askAuthorLastName);
        String lastName = userInput.next();

        System.out.println(Author.askAuthorLocation);
        String country = userInput.next();

        System.out.println(Author.askAuthorAliveOrDead);
        String isAlive = userInput.next();

        if (isAlive.equalsIgnoreCase("Y")) {
            System.out.println(Author.askAuthorAge);
            age = userInput.nextInt();
            isAlive = "true";
        } else if (isAlive.equalsIgnoreCase("N")) isAlive = "false";


        boolean moreBook = false;
        do {
            System.out.println(Book.askToEnterBook);
            String enterBook = userInput.next();

            if (enterBook.equalsIgnoreCase("Y")) {

                System.out.println(Book.askBookName);
                String bookName = userInput.next();

                System.out.println(Book.askBookGenre);
                String bookGenre = userInput.next();

                System.out.println(Book.askBookPages);
                int bookPages = userInput.nextInt();

                Book book = new Book(bookName, bookGenre, bookPages);
                Books.add(book);
            } else if (enterBook.equalsIgnoreCase("N")) {
                moreBook = true;
                break;
            }

        } while (moreBook == false);

        if (isAlive.equalsIgnoreCase("true")) {
            Author author = new Author(firstName, lastName, country, isAlive, age, Books);
            Authors.add(author);
        } else if (isAlive.equalsIgnoreCase("false")) {
            Author author = new Author(firstName, lastName, country, isAlive, Books);
            Authors.add(author);
        }

        for (Author author : Authors) {
            System.out.println(author);
        }
        for (Book object : Books) {
            System.out.println(object);
        }

    }
}

