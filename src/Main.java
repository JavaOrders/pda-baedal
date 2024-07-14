import java.util.Scanner;
import restaurant.RestaurantController;
import restaurant.RestaurantView;
import restaurant.Restaurant;
import java.util.List;
import cart.CartController;
import menu.Menu;
import cart.CartView;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantController restaurantController = new RestaurantController();
        RestaurantView restaurantView = new RestaurantView();
        CartView cartView = new CartView();
        CartController cartController = new CartController(cartView);

        boolean showRestaurantList = true;
        Restaurant selectedRestaurant = null;

        while (true) {
            if (showRestaurantList) {
                System.out.println("레스토랑 리스트를 보여줄게요!");
                List<Restaurant> restaurants = restaurantController.getAllRestaurants();
                restaurantView.displayRestaurants(restaurants);

                System.out.println("메뉴를 보려면 레스토랑 이름을 입력하세요. 종료하려면 'exit'를 입력하세요.");
            } else {
                restaurantView.displayMenus(selectedRestaurant.getMenus());
                System.out.println("장바구니에 담길 원하는 메뉴가 있으면 말해주세요! 종료하려면 'exit'를 입력하세요.");
            }

            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            if (showRestaurantList) {
                selectedRestaurant = restaurantController.getRestaurantByName(input);
                if (selectedRestaurant != null) {
                    showRestaurantList = false;
                } else {
                    System.out.println("해당 이름의 레스토랑이 없습니다.");
                }
            } else {
                Menu selectedMenu = selectedRestaurant.getMenuByName(input);
                if (selectedMenu != null) {
                    cartController.addMenuToCart(selectedMenu);
                } else {
                    System.out.println("해당 이름의 메뉴가 없습니다.");
                }
            }
        }
        sc.close();
    }
}
