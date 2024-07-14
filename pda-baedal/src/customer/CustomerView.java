package customer;

public class CustomerView {

    public void printOrderSuccess() {
        System.out.println("주문이 완료되었습니다~");
    }

    public void printOrderFailure() {
        System.out.println("주문이 실패했습니다ㅠ");
    }

    public void printTotalExpense(long totalExpense) {
        System.out.println("Total Expense: " + totalExpense);
    }
}
