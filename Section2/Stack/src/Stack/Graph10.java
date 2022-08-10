package Stack;
import java.util.*;

public class Graph10 {
    public int[][] createMatrix(int[][] edges) {

        int[][] graph;              // int형 2차원 배열 생성

        // 행렬의 크기를 구합니다.
        // edgesLength 변수를 0으로 할당하고, edges를 전부 순회해 제일 큰 숫자를 max에 할당합니다.
        // edgesLength 크지 않을 경우엔 바꾸지 않습니다.
        int edgesLength = 0;    // 행렬의 크기 구한 후

        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++) {
                if (edgesLength < edges[i][j]) edgesLength = edges[i][j]; // 순회 후 제일 큰 숫자를 max에 할당 -> 배열
            }
        }
        // matrix의 뼈대를 잡습니다.
        // max로 구한 최대값에 1을 더하여 array를 생성합니다.(0번째부터 있기 때문입니다)
        // 자동으로 모든 배열의 요소는 0으로 만들어집니다.
        graph = new int[edgesLength + 1][edgesLength + 1];

        // edges를 순회하며 무향인 곳엔 각각의 간선에 1로 바꾸어 주고, 방향이 있는 간선엔 해당 간선에만 1로 바꾸어 줍니다.
        // 만약, [0, 3, 0]가 들어왔다면,
        // 만들어 둔 result의 0 번째 row에 3 번째 col에 1을 추가합니다.
        // [ 0, 0, 0, 1 ] => 0번째 버텍스가 갈 수 있는 간선 중, 3 번으로 가는 간선만 갈 수 있습니다.
        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            int direction = edges[i][2];
            //일시 방향일 경우 단방향
            if(direction == 0) graph[from][to] = 1;
                //일시 무향일 경우 양방향
            else if(direction == 1) {
                graph[from][to] = 1;
                graph[to][from] = 1;
            }
        }
        return graph;
    }
}
// 2차원배열

/*
0번째: 간선의 시작 정점 (0 이상의 정수)
1번째: 간선의 도착 정점 (0 이상의 정수)
2번째: 방향성 (1 == 일시 무향, 0 == 일시 방향)

0 1 2 3
0 0 1

*/