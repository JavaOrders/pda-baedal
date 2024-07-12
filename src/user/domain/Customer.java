package user.domain;

public class Customer extends Person{
    private static final int CUSTOMER = 1;

    private Cart myCart;
    private long totalExpennse;
    private List<Order> orderHistory;

    Customer(String name) {
        this.name = name;
        type = CUSTOMER;
        myCart = new Cart();
        orderHistory = new ArrayList<Order>();
    }

}
