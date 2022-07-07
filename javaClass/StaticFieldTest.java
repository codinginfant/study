public class StaticFieldTest {
    public static void main(String[] args) {
        StaticField staticField1 = new StaticField();       // 객체 생성
        StaticField staticField2 = new StaticField();

        staticField1.num1 = 100;
        staticField2.num1 = 1000;

        System.out.println(staticField1.num1);              // 100
        System.out.println(staticField2.num1);              // 1000

        staticField1.num2 = 150;
        staticField2.num2 = 1500;

        System.out.println(staticField1.num2);              // 1500
        System.out.println(staticField2.num2);              // 1500 (static 사용하여 공통값 적용)
    }
}

class StaticField {
    int num1 = 10;              // 인스턴스 필드
    static int num2 = 15;       // 정적 필드
}
