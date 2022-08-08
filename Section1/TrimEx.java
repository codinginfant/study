public class TrimEx {
    public static void main(String[] args) {
        String str = new String("Java     ");
        System.out.println("문자열 : " + str);          // 문자열 : Java
        System.out.println(str + '|');                  // Java      |
        System.out.println(str.trim() + '|');           // Java|
        System.out.println("trim() 메서드 호출 후 문자열 : " + str);
    }                                                   // trim() 메서드 호출 후 문자열 | Java
}
