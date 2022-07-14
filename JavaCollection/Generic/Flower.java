package Generic;

public class Flower {
}
class Flower {...}
class Rose extends Flower {...}
class RosePasta {...}

// 제네릭 클래스 정의
class Basket<T> {
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}

    public static void main(String[] args) {
        Basket<Flower> flowerBasket = new Basket<>();
        flowerBasket.setItem(new Rose());               // 다형성 적용
        flowerBasket.setItem(new RosePasta());          // 에러
    }

    public static void main(String[] args) {
    // 인스턴스화
        Basket<Rose> roseBasket = new Basket<>();
        Basket<RosePasta> rosePastaBasket = new Basket<>();
    }