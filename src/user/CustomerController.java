package user;

import java.io.IOException;
import user.domain.Customer;
import user.service.CustomerService;

public class CustomerController {
    private CustomerService customerService = new CustomerService();

    public String signUp(String signUpInfo) throws IOException {
        String response;

        try {
            customerService.signUp(signUpInfo);
            response = customerService.getSuccessfulSignUpMessage();
        } catch (IllegalArgumentException e) {
            response = e.getMessage();
        }

        return response;
    }

    public String login(String id, String password) throws IOException {
        Customer customer = customerService.login(id, password);
        String response;

        if(customer == null) {
            response = customerService.getInvalidCredentialsMessage();
            return response;
        }

        response = customerService.getSuccessfulLoginMessage();
        return response;
    }

}
