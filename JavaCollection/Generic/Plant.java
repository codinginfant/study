package Generic;

public class Plant {
}
interface Plant {...}

class Flower implements Plant {...}
class Rose extends Flower implements Plant {...}     // extends 사용. 특정 클래스만 타입 지정 가능

class Basket<T extends Plant> {                      // 또는 class Basket<T extends Plant & Flower>
    private T item;                                  // 특정 클래스 상속 & 특정 인터페이스 구현 클래스로 지정 가능
}

    public static void main(String[] args) {
        // 인스턴스화
        Basket<Flower> flowerBasket = new Basket<>();
        Basket<Rose> roseBasket = new Basket<>();
    }