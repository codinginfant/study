import java.util.*;
public class AndEx {
    public boolean and(boolean[] arr) {
        // 더 이상 쪼갤 수 없는 경우
        if(arr.length==0) return true;
        // 작은 단위로 쪼갤 수 있는 경우
        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);
        /*
        if(!head || !and(tail)) return false      둘 중 하나라도 F이면 F
         */
        return (head && and(tail));
    }

}
/*
and
T && T = T
T && F = F
F && T = F
F && F = F

 or
 T || T = T
 T || F = T
 F || T = T
 F || F = F
 */
