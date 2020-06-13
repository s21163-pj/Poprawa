import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Functions extends Shop{
    public Functions(int productId, String productName, @NotNull(message = "Price cannot be null") double price, Product product1,
                     @Size(min = 6, max = 500, message = "Shop name must have at least 6 characters") String shopName,
                     String shopId, ArrayList<Product> availableProducts, ArrayList soldProducts) {
        super(productId, productName, price, product1, shopName, shopId, soldProducts);
    }

    private Optional<Product> findProductInShop(int productId) {
        return availableProducts.stream().filter(product -> getProductId() == productId).findFirst();

    }

    private Optional<Product> findProductInCustomer(int productId, Customer customer) {
        return getBoughtThings.stream

    }

    public List<Product> sellProduct(int productId, Customer customer) {

    }
}
