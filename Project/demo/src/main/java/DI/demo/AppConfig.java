package DI.demo;

import DI.demo.discount.RateDiscountInfo;
import DI.demo.order.OrderService;
import DI.demo.order.OrderServiceImpl;
import DI.demo.discount.CurrentDiscountInfo;
import DI.demo.discount.DiscountInfo;
import DI.demo.user.UserRepository;
import DI.demo.user.UserRepositoryImpl;
import DI.demo.user.UserService;
import DI.demo.user.UserServiceImpl;

public class AppConfig {                // 애플리케이션의 전체 동작 구성. 설정 클래스 생성
    public UserService userService() {
        return new UserServiceImpl(new UserRepositoryImpl());
    }

    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new UserRepositoryImpl(), new CurrentDiscountInfo());
    }

    public DiscountInfo disocuntInfo() {
        // return new CurrentDiscountInfo();
        return new RateDiscountInfo();
    }
}
// AppConfig 내 UserRepository와 discountInfo에서 변경사항 있으면 두 구현부분만 수정해주면 됨
