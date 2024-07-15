package cart;

import java.util.List;
import menu.Menu;

public class CartView {
    public void displayMenuAddedMessage(boolean isMenuAdded) {
        if (isMenuAdded) {
            System.out.println("장바구니에 담기 성공!");
        } else {
            System.out.println("장바구니 담기에 실패하였습니다."
                    + "\n같은 가게의 메뉴만 장바구니에 담을 수 있습니다.");
        }
    }

    public void displayMenuRemovedMessage(boolean isMenuRemoved) {
        if (isMenuRemoved) {
            System.out.println("장바구니에서 삭제 성공!");
        } else {
            System.out.println("장바구니에서 삭제에 실패하였습니다.");
        }
    }

    public void displayClearMessage() {
        System.out.println("장바구니가 비워졌습니다.");
    }

    public void displayMenuList(List<Menu> menuList) {
        System.out.println("---장바구니 목록---");
        for (Menu menu : menuList) {
            System.out.println(menu.getName());
        }
        System.out.println("------------------");
    }
}
