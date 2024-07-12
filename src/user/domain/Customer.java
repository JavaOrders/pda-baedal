package user.domain;

public class Customer extends Person{
    private static final int CUSTOMER = 1;

    private Cart myCart;
    private long totalExpennse;
    private List<Order> orderHistory;
    private String id;
    private String pw;

    public Customer(String id, String password, String name) {
        super(name,CUSTOMER);
        myCart = new Cart();
        orderHistory = new ArrayList<Order>();
        this.id = id;
        this.pw = password;
    }

    public Cart getMyCart() {
        return myCart;
    }

    public void setMyCart(Cart myCart) {
        this.myCart = myCart;
    }

    public long getTotalExpennse() {
        return totalExpennse;
    }

    public void setTotalExpennse(long totalExpennse) {
        this.totalExpennse = totalExpennse;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }
}
