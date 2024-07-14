package cart;
import menu.Menu;


public class CartView {
    public void displayCart(Cart cart) {
        System.out.println("현재 장바구니:");
        for (Menu menu : cart.getMenus()) {
            System.out.println(menu.getName() + " - " + menu.getPrice() + "원");
        }
        System.out.println("총 가격: " + cart.getTotalPrice() + "원");
    }

    public void displayMenuAdded(Menu menu) {
        System.out.println(menu.getName() + "가 장바구니에 추가되었습니다.");
    }
}