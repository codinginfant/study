public class Gugudan {
}
// 반복문 구구단
public void Gugudan(int level) {
    for(int count = 0; count<9; count++) {          // 1부터 9까지 곱. count == 10일 경우 반복문 종료하고 메서드 종료
        System.out.printf("%d x %d = %\n", level, count, level * count);
    }
}

// 재귀 구구단
public void Gugudan(int level, int count) {
    if(count > 9) {                                 // 1부터 9까지 곱. count == 10일 경우 재귀 호출 종료 메서드 종료
        return;
    }
    System.out.println("%d x %d = %d\n", level, count, level*count);
    Gugudan(level, count++);
}