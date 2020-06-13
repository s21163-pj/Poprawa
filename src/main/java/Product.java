import javax.validation.constraints.NotNull;

public class Product {

    public Product(int productId, String productName, @NotNull(message = "Price cannot be null") double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    private int productId;
    private String productName;

    @NotNull(message = "Price cannot be null")
    private double price;


    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
