public class OrEx {
    public boolean or(boolean[] arr) {
        if(arr.length == 0) return false;
        boolean head = arr[0];
        boolean[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return (head || of(tail));
}
// import java.util.stream.IntStream;
