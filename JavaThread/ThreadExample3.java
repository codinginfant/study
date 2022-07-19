package java;

public class ThreadExample3 {
    public static void main(String[] args) {

        Runnable threadTask = new ThreadTask();
        Thread thread1 = new Thread(threadTask);
        Thread thread2 = new Thread(threadTask);

        thread1.setName("조영현");
        thread2.setName("나태웅");

        thread1.start();
        thread2.start();


    }
}

class Account {
    private int balance = 10000;

    public int getBalance() {
        return balance;
    }
    public synchronized boolean withdraw(int money) { // synchronized 쓰면 동기회 됨 if문은 임계영역. 하나의 스레드만 사용 가능
        if (balance >= money) {
            try {Thread.sleep(10000);} catch (Exception error) {} //     예외 발생시 try catch문 사용
            // sleep 은 일시정지 강제로 재워주는
            balance -= money;
            return true;
        }
        else return false; // 안써줘도 상관없음
    }
}
class ThreadTask implemets Runnable {
    Account account = new Accont();
    public void run() {
        while (account.getBalance() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 1000; // 0~2.999999 *3 + 1
            boolean denied = account.withdraw(money);
            System.out.println(String.format("%s님께서 %d원을 인출 시도 / 잔액 : %d %s",   // 실패한 경우 %s로 나타냄
                    Thread.currentThread().getName(), money, account.getBalance(), denied ? " => DENIED" : ""
            ));                                         // if denied 3항 조건 연산자
        }


    }
}
// 같은 법카를 쓰는 상황
// 계좌 -> Account
// 사람 -> 스레드