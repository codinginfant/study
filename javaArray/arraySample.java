public class arraySample {

    int [] num = {1, 2, 3, 4, 5};

    int [] favoriteThings = {x, y, z};

    boolean [] isRainy = {true, false, true... }


    반복문 사용
    int[] arr = { 1, 2, 3, 4, 5 };
    for (int i = 0; i < arr.length; i++) {

}   return arr[i];

    또는 return (Arrays.toString(arr));

    for (int i=0; i <변수이름; i++) {
        sopv ("heightArray[i] = " + heightArray[i])};
    // 배열이 훨씬 편하다

        heightArray.length; // ()호출연산자 사용 못함 어레이만 특

soutv
() 호출연산자

        어레이값 추가할 때
새 배열 만들고 어레이 값 뒤에 추가해줘야

        /// 배열 탐색//
//for문 이용
        int[] scores = { 100, 90, 85, 95, 100 };
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
        sum += scores[i];
        }
        System.out.println(sum); // 470

// while문 이용
        int[] scores = { 100, 90, 85, 95, 100 };
        int sum = 0;
        int i = 0;

        while (i < scores.length) {
        sum += scores[i++];
        }
        System.out.println(sum); // 470

// 향상된 for 문
        int[] scores = { 100, 90, 85, 95, 100 };   // 리스트 값 돌아가면서 넣어주기 (길이 저장 안해도 자동으로 인식)
        int sum = 0;

        for (int score: scores) {                  // 변수 이름 겹치지 않게
        sum += score;
        }
        System.out.println(sum); // 470

