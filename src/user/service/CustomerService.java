package user.service;

import Utils.Util;
import java.io.IOException;
import user.UserDAO;
import user.UserView;
import user.domain.Customer;

public class CustomerService {
    private final UserDAO userDAO = new UserDAO();
    private final UserView userView = new UserView();

    public  void signUp() throws IOException {
        String signUpInfo = userView.inputSignUpInfo();

        String[] userInfo = Util.inputSpliter(signUpInfo);
        Customer newUser = new Customer(userInfo[0],userInfo[1],userInfo[2]);

        userDAO.save(newUser);
    }
}
