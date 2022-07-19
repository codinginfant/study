package java;

public class ThreadExample2 {
    public static void main(String[] args) {

        Thread thread2 = new ThreadTask2();     // 스레드 생성
        thread2.start();
        System.out.println("thread2.getName() = " + thread2.getName());
        thread2.setName("코드스테이츠");
        System.out.println("thread2.getName() = " + thread2.getName());
        System.out.println("thread2.getName() = " + Thread.currentThread().getName());

        for (int i = 0; i<9999; i++) {
            System.out.print("짝");
    }

}

class ThreadTask2 extends Thread {
    public void run() {
        System.out.println("스레드 이름을 확인해 봅시다.");
        }
    }
}
/*
스레드가 수행할 작업을 기술한다
2. 스레드를 생성한다
스레드를 실행한다
 */