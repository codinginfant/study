package DI.demo;

import DI.demo.user.UserServiceImpl;
import DI.demo.user.User;
import DI.demo.user.UserGrade;
import DI.demo.user.UserService;
import DI.demo.user.UserServiceImpl;

public class UserApp {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();      // UserServiceImpl에 의존중

        AppConfig appConfig = new AppConfig();              // 의존하지 않도록 수정
        UserService userService = appConfig.userService();

        User user = new User(0L, "kimcoding", UserGrade.GRADE_2);
        userService.signup(user);

        User currentUser = userService.findUser(0L);
        System.out.println("signup user : " + user.getName());
        System.out.println("current user : " + currentUser.getName());

        if(user.getName().equals(currentUser.getName())) {
            System.out.println("새롭게 가입한 사용자와 현재 사용자가 같습니다.");
        }
    }
}
