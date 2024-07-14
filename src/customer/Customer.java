package customer;
import user.Person;
import cart.Cart;
import java.util.List;
import java.util.ArrayList;


public class Customer extends Person {

    private Cart myCart;
    private long totalExpense;
    private List<Order> orderHistory;

    Customer(String name, int type, Cart myCart, long totalExpense) {
        super(name, type);
        this.myCart = new Cart();
        this.totalExpense = totalExpense;
    }


    public Cart getMyCart() {
        return myCart;
    }

    public long getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(long totalExpense) {
        this.totalExpense = totalExpense;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }


}
