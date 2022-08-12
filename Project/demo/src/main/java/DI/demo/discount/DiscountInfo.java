package DI.demo.discount;

import DI.demo.user.User;

public interface DiscountInfo {
    int discount(User user, int price);
}
