public class InstanceInnerClass {

}
class Outer {                       // 외부 클래스
    private int num = 1;            // 외부 클래스 인스턴스 변수
    private static int sNum = 2;    // 외부 클래스 정적 변수

    private InClass inClass;        // 내부 클래스 자료형 변수 선언

    public Outer() {
        inClass = new InClass();    // 외부 클래스 생성자
    }

    class IncClass {                // 인스턴스 내부 클래스
        int inNum = 10;             // 내부 클래스의 인스턴스 변수

        void Test() {
            System.out.println("Outer num = " + num + "(외부 클래스의 인스턴스 변수");
            System.out.println("Outer nNum = " + sNum + "(외부 클래스의 정적 변수");
        }   // Outer num = 1(외부 클래스의 인스턴스 변수)
    }       // Outer sNum = 2(외부 클래스의 정적 변수)
    public void testClass() {
        inClass.Test();
    }
}

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출"):
        outer.testClass();          // 내부 클래스 기능 호출
    }
}