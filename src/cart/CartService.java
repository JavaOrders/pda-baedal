package cart;

import java.util.List;
import menu.Menu;
import user.UserDAO;

public class CartService {
    private static final CartDAO cartDAO = new CartDAO();
    private static final UserDAO userDAO = new UserDAO();

    public boolean addMenu(Menu menu, String userId) {
        Cart currentCart = getCartByUserId(userId);
        if (currentCart.getRestaurant() == null) {
            // TODO : 빈 카트일 경우 cart의 restaurant 필드를 해당 메뉴의 가게로 초기화
            
        }

        if (isEqualRestaurant(menu, currentCart)) {
            currentCart.addMenu(menu);
            calcTotalPrice(currentCart);
            return true;
        }
        return false;
    }

    public boolean isEqualRestaurant(Menu menu, Cart cart) {
        String restaurantOfNewMenu = menu.getRestaurantName();
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
}
