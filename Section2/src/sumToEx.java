public class sumToEx {
    public int sumTo(int num) {
        // 더 이상 쪼갤 수 없는 경우
        if(num == 0) {
            return 0;
        }
        int head = num;
        int tail = num -1;

        return head + sumTo(tail);
                4 + sumTo(3);
                    3 + sumTo(2);
                        2 + sumTo(1);
                        2 + 1;
                    3 + 3;
                4 + 6
    }
}
