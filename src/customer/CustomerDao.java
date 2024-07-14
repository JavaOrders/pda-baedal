package customer;

import user.Person;
import java.util.HashMap;
import java.util.Map;

public class CustomerDao {

    private final Map<String, Customer> db = new HashMap<>();

    public void addCustomer(Customer customer) {
        db.put(customer.getName(), customer);
    }

    public Customer getCustomer(String name) {
        return db.get(name);
    }

    public void removeCustomer(String name) {
        db.remove(name);
    }

    public Map<String, Customer> getAllCustomers() {
        return new HashMap<>(db);
    }
}
