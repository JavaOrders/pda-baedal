package cart;

public class CartView {
}
    public void displayMenuAddedMessage(boolean isMenuAdded) {
        if (isMenuAdded) {
            System.out.println("장바구니에 담기 성공!");
        } else {
            System.out.println("장바구니 담기에 실패하였습니다."
                    + "\n같은 가게의 메뉴만 장바구니에 담을 수 있습니다.");
        }
    }

