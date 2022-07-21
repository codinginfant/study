public class FactorialEx {
    public int factorial(int num) {
        // 더 이상 쪼갤 수 없는 경우
        if(num == 0) return 1;
        int head = num;
        int tail = num - 1;

        return head * factorial(tail);
        // 작은 단위로 쪼갤 수 있는 경우
    }
}
