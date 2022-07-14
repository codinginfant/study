package Generic;

public class BasketT {
}
class Basket<T> {
    private T item;

    public Basket(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void setItem(T item) {
        this.item = item;
    }
}