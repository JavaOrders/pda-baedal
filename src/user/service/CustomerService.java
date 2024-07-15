package user.service;

import Utils.Util;
import java.io.IOException;
import user.UserDAO;
import user.UserView;
import user.domain.Customer;

public class CustomerService {
    private final UserDAO userDAO = new UserDAO();

    public void signUp(String signUpInfo) {
        String[] userInfo = Util.inputSpliter(signUpInfo);
        String userId = userInfo[0];
        String userPassword = userInfo[1];
        String userName = userInfo[2];

        validateDuplicateUserId(userId);
        Customer newUser = new Customer(userId,userPassword,userName);

        userDAO.save(newUser);
    }

    public Customer login(String id, String password) throws IOException {
        Customer retrievedCustomer = userDAO.findById(id);

        if(isPasswordMatched(password, retrievedCustomer)) {
            return retrievedCustomer;
        }
        return null;
    }

    private void validateDuplicateUserId(String userId) {
        Customer findCustomer = userDAO.findById(userId);
        if(findCustomer != null) {
            throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
        }
    }

    private static boolean isPasswordMatched(String password, Customer retrievedCustomer) {
        return retrievedCustomer != null && retrievedCustomer.getPassword().equals(password);
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
