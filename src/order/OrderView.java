package order;

public class OrderView {

    public void printOrder(Order order) {
        System.out.println("주문이 정상적으로 접수되었습니다.");
        System.out.println("주문자 " + order.getCustomer());
        System.out.println("주문한 메뉴정보 " + order.getMenus());
        System.out.println("총 가격은 " + order.getTotalPrice() + "원입니다.");
    }
}
