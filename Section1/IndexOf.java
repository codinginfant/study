public class IndexOf {             // 해당 문자나 문자열 처음 등장하는 위치의 인덱스 반환
    public static void main(String[] args) {
        String str = new String("Oracle Java");
        System.out.println("문자열 : " + str);      // 문자열 : Oracle Java
        System.out.println(str.indexOf('o'));       // -1 (해당 문자열에 포함되지 않으면 -1 반환)
        System.out.println(str.indexOf('a'));       // 2
        System.out.println(str.indexOf("Java"));    // 7
        System.out.println("indexOf() 메서드 호출 후 원본 문자열 : " + str);
    }                                               // indexOf() 메서드 호출 후 원본 문자열 : Oracle Java
}
