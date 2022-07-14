package Generic;
                                        // 제네릭 사용시
public class Basket {                   // class Basket<T> {
    private String item;                //      private T item;

    Basket(String item) {               // public Basket(T item) {
        this.item = item;               //      this.item = item;
    }                                   // }
    public String getItem() {           // public T getItem() {
        return item;                    //      return item;
    }                                   // }
    public void setItem(String item) {  // public void setItem(T item) {
        this.item = item;               //       this.item = item;
    }                                   // }
    /*
    class BasketString { private String item; ... }
    class BasketInteger { private int item; ... }
    class BasketChar { private char item; ... )
    class BasketDouble { private double item; ... }
     */

    // 제네릭 사용시 번거로움 줄일 수 있음

}
