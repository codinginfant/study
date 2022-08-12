package DI.demo;

import DI.demo.order.Order;
import DI.demo.order.OrderService;
import DI.demo.user.User;
import DI.demo.user.UserGrade;
import DI.demo.user.UserService;

public class OrderApp {
    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();
        UserService userService = appConfig.userService();
        OrderService orderService = appConfig.orderService();

        Long userId = 0L;
        User user = new User(userId, "kimlucky", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);
        System.out.println("order = " + order);
//        RateDiscountInfo discountInfo= new RateDiscountInfo();          // 수정
//
//        User user = new User(0L, "kimcoding", UserGrade.GRADE_1);
//        int discountPrice = discountInfo.discount(user, 5000);
//
//        if(discountPrice == 250) {
//            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
//            System.out.println("1등급 회원으로 5000 -> " + discountPrice);
//        }
//        user = new User(0L, "leejava", UserGrade.GRADE_2);
//        discountPrice = discountInfo.discount(user, 5000);
//
//        if(discountPrice == 500) {
//            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
//            System.out.println("2등급 회원으로 5000 -> " + discountPrice);
//        }
    }
}
/*
회원 등급에 알맞은 할인이 적용되었습니다.
1등급 회원으로 5000 -> 500
회원 등급에 알맞은 할인이 적용되었습니다.
2등급 회원으로 5000 -> 1000
 */

// 변경된 할인 정책 적용하려면 OrderServiceImpl 코드 직접 수행해야 (구현 클래스에도 의존)