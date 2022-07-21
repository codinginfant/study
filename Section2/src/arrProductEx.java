public class arrProductEx {
    public int arrProduct(int[] arr) {
        //  더 이상 쪼갤 수 없는 경우
        if(arr.length == 0) {
            return 1;
        }
        // 작은 단위로 쪼갤 수 있는 경우
        int head = arr[0];
        int tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head * arrProduct(tail);
    }
}
