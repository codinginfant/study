enum Level {            // 열거형 생성
    LOW,                // 0 열거상수 자동 할당
    MEDIUM,             // 1
    HIGH                // 2
}

public class LevelEx2 {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;


        switch(level) {
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
}           // 중간 레벨 출력
