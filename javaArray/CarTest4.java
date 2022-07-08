public class CarTest4 {
    public static void main(String[] args) {
        Car car1 = new Car(); // String intV1, static String claV1, void intMe1, static void claMe1
        Car car2 = new Car();// String intV2, static String claV2, void intMe2, static void claMe2


        car1.claV = "저는 클래스 변수입니다";
        System.out.println(car1.claV);
        System.out.println(car2.claV);
        System.out.println(Car.claV);

    }

}

