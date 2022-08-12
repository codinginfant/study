package DI.demo.order;

public class Order {
    private Long userId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long userId, String itemName, int itemPrice, int discountPrice) {
        this.userId = userId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    public int discountPrice() {
        return itemPrice - discountPrice;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userId = " + userId +
                ", itemName = " + itemPrice +
                ", discountPrice = " + discountPrice +
                "}";
    }
}
