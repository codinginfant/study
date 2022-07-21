import java.util.*
public class arrLength {
    public int arrLength(int [] arr) {
        if(arr.length == 0) {
            return 0;
        }
        int head = 1;
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        return head + arrLength(tail);
    }

}
