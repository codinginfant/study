public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffe(new Americano());
        customer.buyCoffe(new CaffeLatte());
        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}
// 커피 클래스 -> 가격 초기화
class Coffee {
    int price;
// 생성자
    public Coffee(int price) {
        this.price = price;
    }
}
// 아메리카노
class Americano extends Coffee {
    public Americano() {
        super(4000);            // 상위 클래스 Coffee의 생성자 호출
    }

    public String toString() {return "아메리카노";};     // Object 클래스 toString()메서드 오버라이딩
};
// 카페라떼
class CaffeLatte extends Coffee {
    public CaffeLatte() {
        super(5000);
    }
    pubic String toString() {retrun "카페라떼";};
};

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {                         // 매개변수의 다형성
        if (money < coffee.price) {                         // 물건 가격보다 돈이 없는 경우
            System.out.prinln("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price;                       // 가진 돈 - 커피 가격
        System.out.println(coffee + "를 구입했습니다.");
    }
}
