public class CarTest5 {
    public static void main(String[] args) {
        Car car1 = new Car();   // String intV1, static String claV1, void intMe1, static void claMe1
        Car car2 = new Car();   // String intV2, static String claV2, void intMe2, static void claMe2

        car1.claV = "저는 클래스 변수입니다";
        System.out.println(car1.claV);
        System.out.println(car2.claV);
        System.out.println(Car.claV);

    }
}

class Car {
    public String intV = "나는 인스턴스 변수";
    public static String claV = "나는 클래스 변수";

    public void intMe(){
        System.out.println(intV);
        System.out.println(claV);
    }

//    public static void claMe(){
//        System.out.println(intV);       // 클래스 메서드에서 인스턴스 변수 접근 불가
//        System.out.println(claV);


}
/*
Static == 클래스에서 만들어진
클래스 변수 - static String claV1, static String claV2
인스턴스 변수
클래스 메서드 - static void claMe1, static void claMe2
인스턴스 메서드
 */

