package main;

import cart.CartController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import menu.Menu;
import order.OrderController;
import restaurant.Restaurant;
import restaurant.RestaurantController;
import restaurant.RestaurantView;
import user.CustomerController;

public class MainView {

    static final int LOGIN = 1;
    static final int SIGN_UP = 2;
    static final int EXIT = 3;
    static final int GET_RESTAURANT_LIST = 1;
    static final int ORDER = 0;
    static final String INIT_LOGINED_ID = "INIT_LOGINED_ID";
    static String loginedId = INIT_LOGINED_ID;

    private final RestaurantView restaurantView;
    private final RestaurantController restaurantController;
    private final CartController cartController = new CartController();
    private final OrderController orderController = new OrderController();


    public MainView(RestaurantController restaurantController) {
        this.restaurantView = restaurantController.getRestaurantView();
        this.restaurantController = restaurantController;
    }

    public void show() {
        int userInput = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CustomerController customerController = new CustomerController();

        printVisitIntro();

        while (true) {
            try {
                if (loginedId == INIT_LOGINED_ID) {
                    printServiceList();
                    userInput = Integer.parseInt(reader.readLine().trim());

                    if (userInput == LOGIN) {
                        login(reader, customerController);

                    } else if (userInput == SIGN_UP) {
                        singUp(reader, customerController);

                    } else if (userInput == EXIT) {
                        exitProgram();
                    }
                } else {
                    printRestaurantList();

                    userInput = Integer.parseInt(reader.readLine().trim());

                    if (userInput == GET_RESTAURANT_LIST) {
                        restaurantController.show();

                        userInput = Integer.parseInt(reader.readLine().trim());
                        Restaurant currentRestaurant = restaurantController.showRestaurant(userInput);

                        if (currentRestaurant == null) {
                            System.out.println("해당 음식점은 존재하지 않습니다.");
                        }
                        while (true) {
                            printRestaurantIntro();
                            List<Menu> currentRestaurantMenus = restaurantController.showMenusByRestaurantName(
                                    currentRestaurant.getName());
                            restaurantView.printMenuList(currentRestaurantMenus);
                            userInput = Integer.parseInt(reader.readLine().trim());

                            if (userInput == ORDER) {
                                orderController.addOrder(loginedId);
                                System.out.println("주문 성공");
                                exitProgram();
                            } else {
                                cartController.addMenu(currentRestaurantMenus.get(userInput - 1), loginedId);
                                cartController.showMenuList(loginedId);
                            }
                        }

                    } else if (userInput == 2) {
                        exitProgram();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void printRestaurantIntro() {
        System.out.println("0번 주문하기");
        System.out.println("메뉴번호 입력 시 장바구니에 추가됩니다.");
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
        if (response.charAt(0) == 'S') {
            loginedId = userid;
        }
        System.out.println(response);
    }

    private static void exitProgram() {
        System.exit(0);
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

    private static void printRestaurantList() {
        System.out.println("1. 음식점 리스트 보기");
        System.out.println("2. 종료");
    }


}

