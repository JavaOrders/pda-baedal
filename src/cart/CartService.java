package cart;

import java.util.List;
import menu.Menu;
import restaurant.Restaurant;
import restaurant.RestaurantDAO;
import user.UserDAO;

public class CartService {
    private static final CartDAO cartDAO = new CartDAO();
    private static final UserDAO userDAO = new UserDAO();
    private static final RestaurantDAO restaurantDAO = new RestaurantDAO();

    public boolean addMenu(Menu menu, String userId) {
        Cart currentCart = getCartByUserId(userId);

        if (currentCart.getRestaurant() == null) {
            updateRestaurantField(currentCart, menu.getRestaurantName());
        }

        if (isEqualRestaurant(menu, currentCart)) {
            currentCart.addMenu(menu);
            calcTotalPrice(currentCart);
            return true;
        }
        return false;
    }

    public Restaurant findRestaurantByName(String name) {
        List<Restaurant> restaurants = restaurantDAO.findAll();

        for (Restaurant restaurant : restaurants) {
            if (restaurant.getName().equals(name)) {
                return restaurant;
            }
        }
        return null;
    }

    public void updateRestaurantField(Cart currentCart, String restaurantName) {
        currentCart.setRestaurant(
                findRestaurantByName(restaurantName)
        );
    }

    public boolean isEqualRestaurant(Menu menu, Cart cart) {
        String restaurantOfNewMenu = menu.getRestaurantName();
        if (cart.getRestaurant() == null) {
            return true;
        }
        String restaurantOfCartItems = cart
                .getRestaurant()
                .getName();

        if (restaurantOfCartItems.equals(restaurantOfNewMenu)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMenu(Menu menu, String userId) {
        Cart currentCart = getCartByUserId(userId);
        if (currentCart.isContainsMenu(menu)) {
            currentCart.removeMenu(menu);
            calcTotalPrice(currentCart);
            return true;
        }
        return false;
    }

    public void calcTotalPrice(Cart cart) {
        Cart currentCart = cartDAO.get(cart);
        List<Menu> currentMenuList = currentCart.getMenus();

        int totalPrice = 0;
        for (Menu menu : currentMenuList) {
            totalPrice += menu.getPrice();
        }
        currentCart.setTotalPrice(totalPrice);
    }

    public void clear(String userId) {
        Cart currentCart = getCartByUserId(userId);
        currentCart.setRestaurant(null);
        currentCart.clearMenus();
        currentCart.setTotalPrice(0);
    }

    public Cart getCartByUserId(String userId) {
        return userDAO.findById(userId).getMyCart();
    }

    public Cart createCart() {
        Cart cart = new Cart();
        return cartDAO.save(cart);
    }

    public List<Menu> getMenuList(String userId) {
        return getCartByUserId(userId).getMenus();
    }
}
