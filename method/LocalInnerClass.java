public class LocalInnerClass {
}
class Outer {
    int num = 5;
    void test() {
        int num2 = 6;
        class LocalInClass {
            void getPrint() {
                System.out.println(num);            // 5
                System.out.println(num2);           // 6
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}
public class main {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}