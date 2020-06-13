import javax.validation.constraints.NotNull;

public class Product {

    private String productId;
    private String productName;

    @NotNull(message = "Price cannot be null")
    private double price;


}
