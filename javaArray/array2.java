import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[][] kcal = {
                { 1982, 2098, 2130 },                   // 내부배열은 1982, 2098, 2130의 3개 요소 가짐
                { 2242, 2431, 2198 },
                { 2365, 1997, 1932 }};


        System.out.println(Arrays.toString(kcal));      // 외부배열의 주소값이 나옴
        System.out.println(Arrays.toString(kcal[0]));   // 내부 배열의 첫번째 배열값이 나옴
        System.out.println("kcal = " + kcal);
    }
}
