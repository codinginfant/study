public class isOddEx {
    public boolean isOdd(int num) {
        // 더 이상 쪼갤 수 없는 경우
        if (num == 1) return true;
        if (num == 0) return false;
        // 문재를 쪼갤 수 있는 경우
        return isOdd(num - 2);
        if (num < 0) {
            return isOdd(-num);
        }
        return isOdd(num-2);
        }
        // 또는 abs로 절대값 사용
    }
}
