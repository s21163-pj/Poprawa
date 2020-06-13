import javax.validation.constraints.Size;
import java.util.ArrayList;

public class Shop {

    @Size(min = 6, max = 500, message = "Shop name must have at least 6 characters")
    private String shopName;

    private String shopId;

    ArrayList<String> availableProducts = new ArrayList<String>();
    ArrayList<String> soldProducts = new ArrayList<String>();

    public String getShopName() {
        return shopName;
    }

    public String getShopId() {
        return shopId;
    }
}
