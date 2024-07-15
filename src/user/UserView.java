package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserView {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String inputSignUpInfo() throws IOException {
        System.out.println("ID PW 이름 공백을 기준으로 입력해주세요");
        String signUpInfo = reader.readLine();
        return signUpInfo;
    }
}
