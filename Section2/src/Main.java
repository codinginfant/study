public class Main {
    public static void main(int level, int cnt) {
        if (cnt > 9) return;
        else System.out.printf("%d x %d = %d\n", level, cnt, level * cnt);
        Gugudan(level, ++cnt);
    }

    public static void main(String[] args) {
        Gugudan(9, 1);
    }
}