package user;

import java.util.HashMap;
import java.util.Map;
import user.domain.Customer;


public class UserDAO {
    private final Map<String, Customer> db = new HashMap<>();

    public void save(Customer user) {
        db.put(user.getName(), user);
    }

}
