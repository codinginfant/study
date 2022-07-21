public class Factorial {
}
// 반복문 팩토리얼
public int Factorial(int number) {
    int result = 1;
    for(int count = number; count > 0; count --) {
        result = result * count;
    }
    return result;
}

// 재귀 팩토리얼
public int Factorial(int number) {
    if(number <= 1) {
        return 1;
    }
    return number * Factorial(number -1);
}