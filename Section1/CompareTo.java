public class CompareTo {                                                       // 대소문자 비교
    public static void main(String[] args) {
        String str = new String("abcd");
        System.out.println("문자열 : " + str);                                 // 문자열 : abcd
        System.out.println(str.compareTo("bcdf"));                             // -1 (작으면 음수 반환)
        System.out.println(str.compareTo("abcd") + "\n");                      // 0 (문자열 같다면 0을 반환)

        System.out.println(str.compareTo("Abcd"));                             // 32 (크면 양수 반환)
        System.out.println(str.compareToIgnoreCase("Abcd"));              // 0
        System.out.println("compareTo() 메서드 호출 후 문자열 : " + str);      // compareTo() 메서드 호출 후 문자열 : abcd
    }
}
