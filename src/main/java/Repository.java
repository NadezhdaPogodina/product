
import ru.netology.product.services.Product;

public class Repository {

    private Product[] products = new Product[0];

    private Book[]       books  = new Book[0];
    private Smartphone[] phones = new Smartphone[0];


    public void add(Product product) {

        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }


    public Product[] findAll() {

        return products;
    }


    public void removeById(int removeId) {
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getID() != removeId) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;

    }


    public Product findById(int Id) {
        for (Product product : products) {
            if (product.getID() == Id) {

                return product;
            }
        }
        return null;
    }


    public Book[] getAuthor() {

        return books;
    }


    public void addAuthor(Book book) {

        Book[] tmp = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            tmp[i] = books[i];
        }
        tmp[tmp.length - 1] = book;
        books = tmp;
    }


    public Book findAuthor(String author) {

        for (Book book : books) {
            if (book.getAuthor() == author) {

                return book;
            }
        }
        return null;
    }


    public Product findPrice(int price) {
        for (Product product : products) {
            if (product.getPrice() == price) {

                return product;
            }
        }
        return null;
    }


    public void addProducer(Smartphone producer) {

        Smartphone[] tmp = new Smartphone[phones.length + 1];
        for (int i = 0; i < phones.length; i++) {
            tmp[i] = phones[i];
        }
        tmp[tmp.length - 1] = producer;
        phones = tmp;
    }


    public Smartphone[] getProducer() {

        return phones;
    }

    public Smartphone findProducer(String producer) {

        for (Smartphone phone : phones) {
            if (phone.getProducer() == producer) {

                return phone;
            }
        }
        return null;
    }
}















