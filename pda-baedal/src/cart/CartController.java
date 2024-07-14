package cart;
import menu.Menu;
public class CartController {
    private CartService cartService;

    public CartController(CartView cartView) {
        this.cartService = new CartService(cartView);
    }

    public void addMenuToCart(Menu menu) {
        cartService.addMenuToCart(menu);
    }

    public Cart getCart() {
        return cartService.getCart();
    }
}