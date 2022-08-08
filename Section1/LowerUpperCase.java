public class LowerUpperCase {
    public static void main(String[] args) {
        String str = new String("Java");
        System.out.println("문자열 : " + str);          // 문자열 : Java
        System.out.println(str.toLowerCase());          // java
        System.out.println(str.toUpperCase());          // JAVA
        System.out.println("두 메서드 호출 후 문자열 : " + str);
    }                                                   // 두 메서드 호출 후 문자열 : Java
}
