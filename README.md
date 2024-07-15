# pda-baedal

## 👩🏻‍💻 팀원 소개
<table>
    <tr align="center">
        <td style="min-width: 150px;">
            <a href="https://github.com/subsub97">
              <img src="https://github.com/subsub97.png" width="100">
              <br />
              <b>김득호(subsub97)</b>
            </a> 
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/Nahyeonnnn">
              <img src="https://github.com/Nahyeonnnn.png" width="100">
              <br/>
              <b>김나현(Nahyeonnnn)</b>
            </a> 
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/sdc05103">
              <img src="https://github.com/sdc05103.png" width="100">
              <br />
              <b>우채윤(sdc05103)</b>
            </a> 
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/yoonjaeuk">
              <img src="https://github.com/yoonjaeuk.png" width="100">
              <br />
              <b>윤재욱(yoonjaewuk)</b>
            </a> 
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/sooyeon-kr">
              <img src="https://github.com/sooyeon-kr.png" width="100">
              <br />
              <b>오수연(sooyeon-kr)</b>
            </a> 
        </td>
        <td style="min-width: 150px;">
            <a href="https://github.com/JaeIn1">
              <img src="https://github.com/JaeIn1.png" width="100">
              <br/>
              <b>이재인(JaeIn1)</b>
            </a> 
        </td>
    </tr>
    <tr align="center">
        <td style="min-width: 150px;">
           Customer class
           <br>
          사용자 프롬포트
        </td>
        <td style="min-width: 150px;">
            Cart class
        </td>
        <td style="min-width: 150px;">
             Munu class
            <br>
             Restaurant class
        </td>
        <td style="min-width: 150px;">
           Customer class
            <br>
          사용자 프롬포트
        </td>
        </td>
        <td style="min-width: 150px;">
             Munu class
            <br>
             Restaurant class
        </td>
        <td style="min-width: 150px;">
            Order Class
        </td>
    </tr>
  <tr align="center">
        <td style="min-width: 150px;">
            <ul>
              <li>로그인 기능</li>
              <li>회원가입 기능</li>
            </ul>
        </td>
        <td style="min-width: 150px;">
            <ul>
                <li>작성 예정</li>
            </ul>
        </td>
        <td style="min-width: 150px;">
            <ul>
              <li>레스토랑 조회</li>
              <li>레스토랑에 해당하는 메뉴들 조회</li>
            </ul>
        </td>
        <td style="min-width: 150px;">
            <ul>
                <li>작성 예정</li>
            </ul>
        </td>
        <td style="min-width: 150px;">
            <ul>
              <li>작성 예정</li>
            </ul>
        </td>
        <td style="min-width: 150px;">
            <ul>
                <li>주문 기능</li>
            </ul>
        </td>
    </tr>
</table>

### 주요기능
1. 회원가입 / 로그인 기능
2. 음식점 선택 및 메뉴판 보기
3. 메뉴 선택후 장바구니 추가
4. 주문하기

### 패키지 구조
```java
.
├── JavaOrders.iml
├── README.md
├── code_style.xml
└── src
    ├── InitRestaurantMenu.java
    ├── Main.java
    ├── Utils
    │   └── Util.java
    ├── cart
    │   ├── Cart.java
    │   ├── CartController.java
    │   ├── CartDAO.java
    │   ├── CartService.java
    │   └── CartView.java
    ├── main
    │   ├── MainController.java
    │   └── MainView.java
    ├── menu
    │   ├── Menu.java
    │   ├── MenuController.java
    │   ├── MenuDAO.java
    │   └── MenuService.java
    ├── order
    │   ├── Order.java
    │   ├── OrderController.java
    │   ├── OrderDAO.java
    │   ├── OrderService.java
    │   └── OrderView.java
    ├── restaurant
    │   ├── Restaurant.java
    │   ├── RestaurantController.java
    │   ├── RestaurantDAO.java
    │   ├── RestaurantService.java
    │   └── RestaurantView.java
    └── user
        ├── CustomerController.java
        ├── UserDAO.java
        ├── UserView.java
        ├── domain
        │   ├── Customer.java
        │   └── Person.java
        └── service
            └── CustomerService.java
```
* 해당 패키지구조를 선택한 이유
  * 도메인 패키지 기준으로 코드를 구성하여 관련 코드들이 응집해 있으며 모듈 단위로 분리할 때 유리
  * 도메인 별로 분리를 했기 때문에 파트 분배가 용이하다.
  * 특정 도메인 로직을 변경할 때 다른 도메인에 영향을 미치지 않고 독립적으로 작업할 수 있다.

 ### 클래스 설계와 역할
 
* customer
  주문 서비스를 이용하는 손님 클래스
  로그인
  회원가입
* Order
  주문 생성
  주문 처리
* Cart
  장바구니 생성
  장바구니 메뉴추가
* Restaurant
  음식점 생성
  음식점 메뉴관리
* Menu
  식당병 매뉴 생성

