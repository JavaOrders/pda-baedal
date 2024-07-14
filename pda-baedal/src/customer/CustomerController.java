//package customer;
//
//public class CustomerController {
//    private CustomerService customerService;
//    private CustomerDao dao;
//    private CustomerView view;
//
//    public CustomerController(CustomerService customerService, CustomerDao dao, CustomerView view) {
//        this.customerService = customerService;
//        this.dao = dao;
//        this.view = view;
//    }
//
//    public void addCustomer(Customer customer) {
//        dao.addCustomer(customer);
//    }


//    public void placeOrder(Customer customer, List<Menu> menuList) {
//        boolean success = customerService.order(customer, menuList);
//        if (success) {
//            view.printOrderSuccess();
//        } else {
//            view.printOrderFailure();
//        }
//        view.printTotalExpense(customerService.calculateTotalExpense(customer.getOrderHistory()));
//    }

//}
