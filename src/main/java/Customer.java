import java.util.ArrayList;

public class Customer {
    public Customer(String customerId, ArrayList<String> boughtThings) {
        this.customerId = customerId;
        this.boughtThings = boughtThings;
    }

    private String customerId;
    public ArrayList<String> boughtThings = new ArrayList<String>();

    public String getCustomerId() {
        return customerId;
    }

    public ArrayList<String> getBoughtThings() {
        return boughtThings;
    }
}
