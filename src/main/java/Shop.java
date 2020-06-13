import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Shop extends Product {
    public Shop(int productId, String productName, @NotNull(message = "Price cannot be null") double price, Product product1,
                @Size(min = 6, max = 500, message = "Shop name must have at least 6 characters") String shopName,
                String shopId, ArrayList soldProducts) {
        super(productId, productName, price);
        this.product1 = product1;
        this.shopName = shopName;
        this.shopId = shopId;
    }

    Product product1 = new Product(1234, "Cake",24.3);

    @Size(min = 6, max = 500, message = "Shop name must have at least 6 characters")
    private String shopName;
    private String shopId;

    public static void arrayList1 (Product) {

        ArrayList<Product> availableProducts = new ArrayList<Product>();
        availableProducts.add(product1);                        //nie wiem dalczego nie chce sie dodac
    }
    ArrayList<Product> soldProducts = new ArrayList<Product>();


    public String getShopName() {
        return shopName;
    }

    public String getShopId() {
        return shopId;
    }
}
