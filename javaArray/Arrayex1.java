public class Arrayex1 {
    // for each 사용하기
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        // for 문 사용하기
        for(int i = 0; i < arr.length; i++) {
            int value = arr[i];
            System.out.println(value);
        }

        // for each 사용하기 
        for(int value:arr) {        // for(변수 변수명 : 출력하려는 자료)
            System.out.println(value);
        }
    }
}
