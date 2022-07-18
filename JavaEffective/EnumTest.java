enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumTest {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        Level[] allLevels = Level.values();         // values() : 모든 상수 배열로 반환
        for(Level x : allLevels) {
            System.out.printf("%s=%d%n", x.name(), x.ordinal());            // LOW=0    이름과 순번 확인
                                                                            // MEDIUM=1
                                                                            // HIGH=2
        }
        Level findLevel = Level.valueOf("LOW");
        System.out.println(findLevel);                                      // LOW
        System.out.println(Level.LOW == Level.valueOf("LOW"));       // true
        switch(level) {                     // vlaueOf() : 열거형과 이름 일치하는 열거형 상수 반환, 불리언값으로 확인
            case LOW:
                System.out.println("낮은 레벨");
                break;
            case MEDIUM:
                System.out.println("중간 레벨");
                break;
            case HIGH:
                System.out.println("높은 레벨");
                break;

        }
    }
}
