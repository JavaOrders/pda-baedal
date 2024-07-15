package cart;

import java.util.HashMap;
import java.util.Map;

public class CartDAO {
    private Map<Integer, Cart> cartDB = new HashMap<>();

    public Cart get(Cart cart) {
        return cartDB.get(System.identityHashCode(cart));
    }

    public Cart save(Cart cart) {
        cartDB.put(System.identityHashCode(cart), cart);
        return cart;
    }
}
