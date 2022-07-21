public class arrSumEx {
    public int arrSum(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        retrun head + arrSum(tail);
    }
}
