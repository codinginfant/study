public class FibonacciEx {
    public int fibonacci(int num) {
        // 정지 조건 할당해주는 것 중요함
        // 더 이상 쪼갤 수 없는 경우
        if(num == 0) return 0;
        if(num == 1) return 1;                  // 또는 if(num <=1) return num;

        // 작은 단위로 쪼갤 수 있는 경우
        return fibonacci(num-1) + fibonacci(num-2);
    }
}
