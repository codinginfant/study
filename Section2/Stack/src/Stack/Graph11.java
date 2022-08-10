package Stack;
import java.util.*;

public class Graph11 {
    // 재귀를 사용한 풀이
    public boolean getDirections(int[][] matrix, int from, int to) {
        //2차원 배열을 선언합니다.
        int[][] currentMatrix = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++) currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        //입력된 출발점과 도착점이 같다면 true를 반환합니다 (재귀 함수의 도착 부분)
        if(from == to) return true;

        // 입력된 출발지점의 1차원 배열을 순회합니다.
        for(int i = 0; i < currentMatrix[from].length; i++) {
            //길이 존재한다면
            if(currentMatrix[from][i] == 1) {
                //해당 루트를 순회했다고 표시합니다( 1 -> 0으로 변경)
                currentMatrix[from][i] = 0;
                //표시된 행렬과, 출발지점을 현재 지점인 i로 변경하여 재귀함수를 실행합니다. 재귀함수가 끝까지 도달하였을때 true를 반환한 경우 true를 반환합니다.
                if(getDirections(currentMatrix, i, to)) return true;
            }
        }
        //길을 찾을수 없는 경우 false를 반환합니다.
        return false;
    }

//   //큐를 사용한 풀이
//   public boolean getDirections(int[][] matrix, int from, int to) {
//     //연결 리스트를 사용하여 큐를 선언합니다.
//     Queue<Integer> queue = new LinkedList<>();
//     //첫 시작점으로 from을 할당합니다.
//     queue.add(from);

//     // 방문했다는 것을 표시하기 위해 1차원 배열을 생성합니다. 초기값은 false로 생성됩니다.
//     boolean[] isVisited = new boolean[matrix.length];
//     // 첫 정점 방문 여부를 표시합니다.
//     isVisited[from] = true;

//     // queue(방문할 곳)의 사이즈가 0이 될 때까지 반복합니다.
//     while(queue.size() > 0) {

//       // queue에서 정점을 하나 빼서 now에 할당합니다.
//       int now = queue.poll();

//       // 목적지인지 검사하고, 목적지라면 true를 반환합니다.
//       if(now == to) return true;

//       // 해당 정점의 간선들을 확인합니다.
//       for(int next = 0; next < matrix[now].length; next++) {
//         // 만약, 간선이 있고 방문하지 않았다면
//         if(matrix[now][next] == 1 && !isVisited[next]) {
//           // queue에 next를 넣습니다. (다음 정점으로 가기 위해)
//           queue.add(next);
//           // 해당 정점을 방문했다는 것을 표시합니다.
//           isVisited[next] = true;
//         }
//       }
//     }
//     // 길이 없다면 false를 반환합니다.
//     return false;
//   }
}
