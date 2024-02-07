package src;

public class Order {
    Buyer buyer;
    Product product;

    public Order(Buyer buyer, Product product) {
        this.buyer = buyer;
        this.product = product;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
