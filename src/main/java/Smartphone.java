import ru.netology.product.services.Product;

public class Smartphone extends Product {

    private String producer;

    public Smartphone(int ID, String name, int price, String producer) {

        super(ID, name, price);
        this.producer = producer;
    }

    public String getProducer() {

        return producer;
    }
}
