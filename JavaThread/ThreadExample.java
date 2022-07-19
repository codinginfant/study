// Runnable~


package java;

public class ThreadExample {
    public static void main(String[] args) {

        Runnable threadTask1 = new ThreadTask1();      // 2. Runnable 구현 객체 생성
        Thread thread1 = new Thread(threadTask1);       // 구현 객체 소괄호 안에 넣어준다
        thread1.start();                                // 운영체제가 스레드를 실행시키

        for (int i =0; i<9999; i++) {
            System.out.print("쿵");
        }
    }
}
class ThreadTask1 implements Runnable {
    public void run() {
        for (int i = 0; i < 9999; i++) {
            System.out.print("짝");
        }
    }
}
/*
1. 스레드가 수행할 작업을 기술한다

 */