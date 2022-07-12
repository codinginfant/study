

public class Coffee {
    int price;

    public Coffee(int price) {
        this.price = price;
    }
}
class Americano extends Coffee {};
class CaffeLatte extends Coffee {};

class Customer {
    int money = 50000;
}
void buyCoffe(Coffee coffee) {                // 매개변수의 다형성
    money = money - coffee.price
}
//void buyCoffee(Americano americano) {       // 아메리카노 구입
//    money = money - americano.price;
//}
//void buyCoffee(CaffeLatte caffeLatte) {     // 카페라떼 구입
//    money = money - caffeLatte.price;
//}