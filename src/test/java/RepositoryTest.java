import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.product.services.Product;

public class RepositoryTest {

    @Test
    public void testRemoveWhenProductExist() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);
        repo.removeById(1);

        Product[] expected = {book2, book3};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testFindById() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product expected = book3;
        Product actual = repo.findById(3);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindNoId() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product expected = null;
        Product actual = repo.findById(4);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testFindPrice() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product expected = book1;
        Product actual = repo.findPrice(100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindOddPrice() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.add(book1);
        repo.add(book2);
        repo.add(book3);

        Product expected = null;
        Product actual = repo.findPrice(200);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testAuthor() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.addAuthor(book1);
        repo.addAuthor(book2);
        repo.addAuthor(book3);


        Book[] expected = {book1, book2, book3};
        Book[] actual = repo.getAuthor();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAuthor() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.addAuthor(book1);
        repo.addAuthor(book2);
        repo.addAuthor(book3);

        Book expected = book2;
        Book actual = repo.findAuthor("Rolling");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindNoAuthor() {

        Repository repo = new Repository();

        Book book1 = new Book(1, "Harry Potter 1", 100, "Tolstoy");
        Book book2 = new Book(2, "Harry Potter 2", 150, "Rolling");
        Book book3 = new Book(3, "Harry Potter 3", 250, "Rowling");

        repo.addAuthor(book1);
        repo.addAuthor(book2);
        repo.addAuthor(book3);

        Book expected = null;
        Book actual = repo.findAuthor("Dostoevsky");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testProducer() {

        Repository repo = new Repository();

        Smartphone phone1 = new Smartphone(1, "Galaxy S", 100, "Samsung");
        Smartphone phone2 = new Smartphone(2, "iPhone 12", 150, "Apple");
        Smartphone phone3 = new Smartphone(3, "Zenphone 9", 250, "Asus");

        repo.addProducer(phone1);
        repo.addProducer(phone2);
        repo.addProducer(phone3);


        Smartphone[] expected = {phone1, phone2, phone3};
        Smartphone[] actual = repo.getProducer();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindProducer() {

        Repository repo = new Repository();

        Smartphone phone1 = new Smartphone(1, "Galaxy S", 100, "Samsung");
        Smartphone phone2 = new Smartphone(2, "iPhone 12", 150, "Apple");
        Smartphone phone3 = new Smartphone(3, "Zenphone 9", 250, "Asus");

        repo.addProducer(phone1);
        repo.addProducer(phone2);
        repo.addProducer(phone3);


        Smartphone expected = phone1;
        Smartphone actual = repo.findProducer("Samsung");
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testFindNoProducer() {

        Repository repo = new Repository();

        Smartphone phone1 = new Smartphone(1, "Galaxy S", 100, "Samsung");
        Smartphone phone2 = new Smartphone(2, "iPhone 12", 150, "Apple");
        Smartphone phone3 = new Smartphone(3, "Zenphone 9", 250, "Asus");

        repo.addProducer(phone1);
        repo.addProducer(phone2);
        repo.addProducer(phone3);


        Smartphone expected = null;
        Smartphone actual = repo.findProducer("Lenovo");
        Assertions.assertEquals(expected, actual);
    }
}
