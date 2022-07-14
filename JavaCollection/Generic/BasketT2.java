package Generic;


Basket<Integer> basket2 = new Basket<Integer>(1);
// 위와 같이 인스턴스화 하면 Basket 클래스는 아래와 같이 변환


class Basket<Integer> {
    private Integer item;

    public Basket(Integer item) {
        this.item = item;
    }
    public Integer getItem() {
        return item;
    }
    public void setItem(Integer item) {
        this.item = item;
    }
}
    Basket<String> basket1 = new Basket<String>("Hello");    // 또는 Basket<String> basket1 = new Basket<>("Hello");
    Basket<Integer> basket2 = new Basket<Integer>(10);       // 또는 Basket<Ingeger> basket2 = new Basket<>(10);
    Basket<Double> basket3 = new Basket<Double>(3.14);       // 또는 Basket<Double> basket3 = new Basket<>(3.14);