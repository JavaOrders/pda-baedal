package user.service;

import utils.Util;
import cart.Cart;
import cart.CartService;
import java.io.IOException;
import user.UserDAO;
import user.domain.Customer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CustomerService {
    private final UserDAO userDAO = new UserDAO();
    private final CartService cartService = new CartService();

    public void signUp(String signUpInfo) {
        String[] userInfo = Util.inputSpliter(signUpInfo);
        String userId = userInfo[0];
        String userPassword = userInfo[1];
        String userName = userInfo[2];

        validateDuplicateUserId(userId);
        Cart initCart = cartService.createCart();

        String encrptedPassword = encryptPassword(userPassword);
        Customer newUser = new Customer(userId,encrptedPassword,userName, initCart);

        userDAO.save(newUser);
    }

    public Customer login(String id, String password) throws IOException {
        Customer retrievedCustomer = userDAO.findById(id);

        if(isPasswordMatched(password, retrievedCustomer)) {
            return retrievedCustomer;
        }
        return null;
    }

    private String encryptPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private void validateDuplicateUserId(String userId) {
        Customer findCustomer = userDAO.findById(userId);
        if(findCustomer != null) {
            throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
        }
    }

    private boolean isPasswordMatched(String password, Customer customer) {
        String encryptedPassword = encryptPassword(password);
        return encryptedPassword.equals(customer.getPassword());
    }

    public String getSuccessfulSignUpMessage() {
        return "Successfully Sign Up!";
    }

    public String getSuccessfulLoginMessage() {
        return "Successfully logged in";
    }

    public String getInvalidCredentialsMessage() {
        return "Invalid username or password";
    }


}
