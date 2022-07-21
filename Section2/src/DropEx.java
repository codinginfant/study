import java.util.*;
public class DropEx {
    public int[] drop(int num, int[] arr) {
        // 더 이상 쪼갤 수 없는

        if(num >= arr.length) {
            return new int[]{{};}
        }
//        if(arr.length == 0) {
//            return arr;
//        }
//        if(num == 0) {
//            return arr;     // 빈 배열 호출
        num = num -1;
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);    //  뒤에서 하나 빼기
        return drop(num, tail);
        }
    }
}
