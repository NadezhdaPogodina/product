
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.services.Product;

public class ManagerTest {

    @Test
    public void testAdd() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rowling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSearchWhenFewProductsFound() {

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rowling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);

        Product[] expected = {book1, book2, book3};
        Product[] actual = manager.searchBy("Potter");
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testSearchOneBook() {

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rowling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Potter 1");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchNoBook() {

        Repository repo = new Repository();
        Manager manager = new Manager(repo);
        Book book1 = new Book(1, "Harry Potter 1", 100, "Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rowling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


        Product[] expected = {};
        Product[] actual = manager.searchBy("Treasure");
        Assertions.assertArrayEquals(expected, actual);
    }
}