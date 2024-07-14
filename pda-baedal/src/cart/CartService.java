package cart;
import menu.Menu;

public class CartService {
    private Cart cart;
    private CartView cartView;

    public CartService(CartView cartView) {
        this.cart = new Cart();
        this.cartView = cartView;
    }

    public void addMenuToCart(Menu menu) {
        cart.getMenus().add(menu);
        cart.setTotalPrice(cart.getTotalPrice() + menu.getPrice());

        // 메뉴 추가 메시지와 현재 장바구니 내용을 출력
        cartView.displayMenuAdded(menu);
        cartView.displayCart(cart);
    }

    public Cart getCart() {
        return cart;
    }
}
