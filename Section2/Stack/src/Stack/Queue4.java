package Stack;

public class Queue4 {
    ArrayList<Integer> answer = new ArrayList<>();                // 정답 담을 변수 arraylist에 값 담기
    List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(boxes)); // 선언부터 모르겠음
    // .asList를 사용해서 box(integer) -> list로 바꿔준다

    while (arrayList.size() > 0) { // 만약 찾았다면, 해당 key를 answer에 넣고, ArrayList에서 그만큼 제외합니다.
        for(int i = 0; i < arrayList.size(); i++) {     // for문 순회하면서
            if(arrayList.get(i) > arrayList.get(0)) {     // .get()     주어진 인덱스에 저장된 객체 반환
                answer.add(i);
                arrayList = arrayList.subList(i , arrayList.size());     // .subList(fromlist, endlist) 리스트 잘라내기 i번째부터 arrayList의 요소 개수만큼 arrayList에 할당하라
                break;                            // list.size() 리스트에 들어있는 갯수
            }
            // 만약 찾지 못했다면 answer에 arrayList 크기를 넣은 후, arrayList 내부의 요소를 전부 삭제합니다.
            if(i == arrayList.size() - 1) {       // i가 arrayList의 마지막이랑 똑같으면
                answer.add(arrayList.size());        // answer에 arrayList의 요소의 개수를 추가한다
                arrayList.clear();                  // arrayList의 요소를 전체 삭제?
            }
        }
    }
    return answer.stream().max(Integer::compare).orElse(-1);  // answer를 스트림 객체로 만들어서 -> 스트림 클래스 안에 있는 max() 메서드를 이용
}                                                           // Integer::compare Integer 클래스에 있는 compare 메서드를 사용해서 max를 구하고
//  람다식으로 선언하기 위해서                                     // 예외의 경우 -1 리턴. orElse(-1) if문에서 else 쓰는 방식이랑 같음 (보편적으로 -1 쓰나보다)

}
/*\
while(arrayList.size() > 0) {
      for(int i = 0; i < arrayList.size(); i++) {
        if(arrayList.get(i) > arrayList.get(0)) {
          .add(i);
          arrayList = arrayList.subList(i, arrayList.size());
          break;
        }
        if(i == arrayList.size() -1 ) {
          .add(arrayLIst.size()-1) {
            .add(arrayList.size());
            arrayList.clear();
          }
        }
      }
      retrun */
}
