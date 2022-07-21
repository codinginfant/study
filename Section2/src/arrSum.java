public int arrSum(int[] arr) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) {
        sum+= arr[i];
        }
    return sum;
}

public int arrSum (int[] arr) {
    if (arr.length == 0) {      // 빈 배열을 받았을 때 0을 리턴하는 조건문.
        return 0;               // 가장 작은 문제를 해결하는 코드 & 재귀를 멈추는 코드
        }
    return arr[0] + arrSum(arr);    // 배열의 첫 요소 + 나머지 요소가 담긴 배열을 받는 arrSum함수
        }                           // 재귀 (자기 자신을 호출)을 통해 문제를 작게 쪼개나가는 코드