package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import user.CustomerController;

public class MainView {

//    static final int DISPLAY_RESTAURANT_LIST = 1;
//    static final int DISPLAY_TOTAL_EXPENSE = 2;
    static final int LOGIN = 1;
    static final int SIGN_UP = 2;
    static final int EXIT = 3;
    static final String INIT_LOGINED_ID = "INIT_LOGINED_ID";

    static String loginedId = INIT_LOGINED_ID; ;

    private final MainController mainController;

    public MainView(MainController mainController) {
        this.mainController = mainController;
    }

    //TODO: RestaurantController.show
    public static void main(String[] args) throws IOException {
        int userInput = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomerController customerController = new CustomerController();

        printVisitIntro();

        while(true) {
            if(loginedId == INIT_LOGINED_ID) {
                printServiceList();
                userInput = Integer.parseInt(reader.readLine().trim());

                if(userInput == LOGIN) {
                    login(reader, customerController);

                }
                else if (userInput == SIGN_UP) {
                    singUp(reader, customerController);

                }
                else if (userInput == EXIT) {
                    System.exit(0);
                }
            }
            else{
                //로그인 된 경우 -> 여기 페이지 이름을 뭐라고 하죠?
                System.out.println("1. 음식점 리스트 보기");
                System.out.println("2. 종료");
                userInput = Integer.parseInt(reader.readLine().trim());
            }

        }

    }

    private static void singUp(BufferedReader reader, CustomerController customerController) throws IOException {
        System.out.println("회원가입 페이지 입니다.");
        System.out.println("Ex) ID PW 이름 순서로 공백으로 나누어 입력해주세요.");
        String userInfo = reader.readLine();

        String response = customerController.signUp(userInfo);
        System.out.println(response);
    }

    private static void login(BufferedReader reader, CustomerController customerController) throws IOException {
        //로그인 로직을 수행해야지
        System.out.println("로그인 페이지 입니다.");
        System.out.println("ID : ");
        String userid = reader.readLine();
        System.out.println("PW : ");
        String userPassword = reader.readLine();

        String response = customerController.login(userid, userPassword);
        if(response.charAt(0) == 'S') {
            loginedId = userid;
        }
        System.out.println(response);
    }

    public static void printVisitIntro() {
        System.out.println("\u001B[34m*****************************************************\u001B[0m");
        System.out.println("\u001B[34m***                                             ***\u001B[0m");
        System.out.println("\u001B[34m***           주문의 자바 사이트에 오신 것을    ***\u001B[0m");
        System.out.println("\u001B[34m***                  환영합니다!                ***\u001B[0m");
        System.out.println("\u001B[34m***                                             ***\u001B[0m");
        System.out.println("\u001B[34m*****************************************************\u001B[0m");

    }

    public static void printServiceList() {
        System.out.println("이용을 원하는 서비스 번호를 입력해주세요.");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 종료");

    }


}

