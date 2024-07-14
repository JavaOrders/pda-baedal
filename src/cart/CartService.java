package cart;

import java.util.List;
import menu.Menu;

public class CartService {
    private static final CartDAO cartDAO = new CartDAO();

    public boolean addMenu(Menu menu, Cart cart) {
        Cart currentCart = cartDAO.get(cart);
        if (currentCart.getRestaurant() == null) {
            // TODO : 빈 카트일 경우 cart의 restaurant 필드를 해당 메뉴의 가게로 초기화
        }

        if (isEqualRestaurant(menu, cart)) {
            currentCart.addMenu(menu);
            calcTotalPrice(cart);
            return true;
        }
        return false;
    }

    boolean isEqualRestaurant(Menu menu, Cart cart) {
        String restaurantOfNewMenu = menu.getRestaurantName();
        String restaurantOfCartItems = cartDAO.get(cart)
                .getRestaurant()
                .getName();

        if (restaurantOfCartItems.equals(restaurantOfNewMenu)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean removeMenu(Menu menu, Cart cart) {
        Cart currentCart = cartDAO.get(cart);
        if (currentCart.isContainsMenu(menu)) {
            currentCart.removeMenu(menu);
            calcTotalPrice(cart);
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

    public void clear(Cart cart) {
        Cart currentCart = cartDAO.get(cart);
        currentCart.setRestaurant(null);
        currentCart.clearMenus();
        currentCart.setTotalPrice(0);
    }
    public void createCart(Cart cart) {
        cartDAO.save(cart);
    }
}
