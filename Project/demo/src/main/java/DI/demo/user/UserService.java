package DI.demo.user;

public interface UserService {
    void signup(User user);
    User findUser(Long userId);
}
