package task_3;

public class Price {
    private String product;
    private String store;
    private double price;

    public Price(String product, String store, double price) {
        this.product = product;
        this.store = store;
        this.price = price;
    }

    public String getStore() {
        return store;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return " {product: '" + product + '\'' +
                ", store: '" + store + '\'' +
                ", price: " + price + " UAH" +
                '}';
    }
}
