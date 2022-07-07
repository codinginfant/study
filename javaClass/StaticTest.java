public class StaticTest {
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.println("인스턴스 변수: " + staticExample.num1);       // 인스턴스 변수: 10. 포인트 연산자 사용
        System.out.println("클래스 변수: " + StaticExample.num2);         // 클래스 변수: -10. 객체 생성 없이 클래스명 사용
    }
}

class StaticExample {
    int num1 = 10;
    static int num2 = -10;
}
