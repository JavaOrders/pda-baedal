package cart;

import java.util.List;
import menu.Menu;

public class CartController {
    private static final CartService cartService = new CartService();
    private static final CartView cartView = new CartView();

    public void addMenu(Menu menu, String userId) {
        boolean isMenuAdded = cartService.addMenu(menu, userId);
        cartView.displayMenuAddedMessage(isMenuAdded);
    }


    public void clear(String userId) {
        cartService.clear(userId);
        cartView.displayClearMessage();
    }

    public void removeMenu(Menu menu, String userId) {
        boolean isMenuRemoved = cartService.removeMenu(menu, userId);
        cartView.displayMenuRemovedMessage(isMenuRemoved);
    }

    public Cart createCart() {
        return cartService.createCart();
    }

    public void showMenuList(String userId) {
        List<Menu> menuList = cartService.getMenuList(userId);
        cartView.displayMenuList(menuList);
    }
}
