package cart;

import menu.Menu;

public class CartController {
    private static final CartService cartService = new CartService();
    private static final CartView cartView = new CartView();

    public void addMenu(Menu menu, Cart cart) {
        boolean isMenuAdded = cartService.addMenu(menu, cart);
        cartView.displayMenuAddedMessage(isMenuAdded);
    }
    public void removeMenu(Menu menu, Cart cart) {
        boolean isMenuRemoved = cartService.removeMenu(menu, cart);
        cartView.displayMenuRemovedMessage(isMenuRemoved);
    }

}
