import java.util.ArrayList;

public class Shop {

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
