//class Seasons {
//    public static fianl Seasons SPRING = new Seasons();
//    public static fianl Seasons SUMMER = new Seasons();
//    public static fianl Seasons FALL = new Seasons();
//    public static fianl Seasons WINTER = new Seasons();
//
//}     호환되지 않는 타입. switch는 char, byte, short, int, Character, Byte, Short, Integer, String, enum만 가능
enum Seasons {SPRING, SUMMER, FALL, WINTER}

public class Main {
    public static void main(String[] args) {
        Seasons seasons = Seasons.SPRING;
        switch (seasons) {
            case SPRING:
                System.out.println("봄");
                break;
            case SUMMER:
                System.out.println("여름");
                break;
            case FALL:
                System.out.println("가을");
                break;
            case WINTER:
                System.out.println("겨울");
                break;


        }
    }
}           // 봄 출력

