public class ConcatEx {                                                // 두 문자열 연결
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("문자열 : " + str);                         // 문자열 : Java
        System.out.println(str.concat("수업"));                   // Java수업
        System.out.println("concat() 메서드 호출 후 문자열 : " + str); // concat() 메서드 호출 후 문자열 : Java
    }
}
