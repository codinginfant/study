package Stack;
import java.util.*;

public class Stack3 {
    public ArrayList<Stack> browserStack(String[] actions, String start) {
        Stack<String> prevStack = new Stack<>();
        Stack<String> nextStack = new Stack<>();
        Stack<String> current = new Stack<>();
        ArrayList<Stack> result = new ArrayList<>();    // 이미 스택 구현된 것

        // 현재 페이지를 넣어줘야. start -> current 넣어줘야
        current.add(start);    // add 대신 PUsh도 가능

        // actions를 순회 () -1, 1, 알파벳)
        for (int i = 0; i < actions.length; i++) {
            // 뒤로 가기 일 경우
            if (actions[i].equals("-1") && !prevStack.empty()) {  // 문자열은 항상 equals 사용해서 비교
                // 1. 원래 있던 페이지를 NEXT 로 이동
                nextStack.push(current.pop());
                // 2. 이전 스택의 가장 첫번째 페이지로 이동 -> 이전 스택의 가장 첫번째 페이지 CURRENT로 이동
                current.push(prevStack.pop());
                // 3. 이전 스택의 가장 첫번째 값을 제거
            }
            // 앞으로 가기 일 경우
            else if (actions[i].equals("1") && !nextStack.empty()) {
                // 1. 원래 있던 페이지를 prev로 이동
                prevStack.push(current.pop());
                // 2. next 첫번째 페이지로 이동 -> next 첫번째 페이지 current 로 이동
                current.push(nextStack.pop());
                // 3. next 첫번째 값을 제거
            }
            // 뒤로, 앞으로 가기 비활성화된 경우
            else if (actions[i].equals("-1") || actions[i].equals("1")) {
            }
            // 아무것도 하지 말아야 합니다.
            // 알파벳일 경우
            else {
                // CURRENT 페이지를 prev로 이동
                prevStack.push(current.pop());
                // next 비움
                nextStack.clear();
                // 입력된 알파벳 페이지로 이동 -> 알파벳을 Current 이동
                current.push(actions[i]);

            }

            // Actions 순회 끝난 경우 , 모든 STACK을 REsult에 넣어준다
            result.add(prevStack);
            result.add(current);
            result.add(nextStack);
            // result를 반환
            return result;
        }
    }
}








    /*
    current.add(start);    // 현재 페이지 추가
       // "B", "C", "-1", "D", "A", "-1", "1", "-1", "-1"
    for(int i = 0; i < actions.length; i++) {       // 액션 : 인터넷 히스토리. 처음부터 순회
      if(actions[i].equals("-1") && !prevStack.empty()) {   // 뒤로가기 + 기존 페이지에서 이동한 경우
        String prevPage = prevStack.pop();                  // pop으로 최근걸 뺴주고 스텍에서 삭제 후 리턴
        nextStack.push(current.pop());                      // 현재 페이지를 넥스트스택에 추가 후 삭제
        current.push(prevPage);                             // pp를 현재 페이지에 추가
      }else if(actions[i].equals("1") && !nextStack.empty()) {  // 앞으로가기 + 넥스트 스택이 비지 않은 경우
        String nextPage = nextStack.pop();                      // 넥스트 스택에서 최근걸 뺴주고 삭제후 리턴
        prevStack.push(current.pop());                          // 최근 추가된 데이터를 삭제 후 리턴한 걸 ps에 추가
        current.push(nextPage);                                 // 다음 페이지를 현재 페이지에 추가
      }else if(actions[i].equals("1") || actions[i].equals("-1")){  // 조건 4. 비활성화된 경우 아무 행동을 하지 않겠다
      }else {
        prevStack.push(current.pop());                        // 최근 추가된 데이터를 삭제 후 리턴한 걸 ps에 추가
        current.push(actions[i]);           // n -> d -> g 일 때
        nextStack.clear();                                    // ns 비우기
      }
    }
    result.add(prevStack);
    result.add(current);
    result.add(nextStack);
    return result;
  }
}



// push(): 스택에 데이터를 추가할 수 있어야 합니다.
// pop(): 가장 나중에 추가된 데이터를 스택에서 삭제하고 삭제한 데이터를 리턴해야 합니다.
// size(): 스택에 추가된 데이터의 크기를 리턴해야 합니다.
// peek(): 가장 나중에 추가된 데이터를 리턴해야 합니다.
// show(): 현재 스택에 포함되어 있는 모든 데이터를 String 타입으로 변환하여 리턴합니다.
// clear(): 현재 스택에 포함되어 있는 모든 데이터 삭제합니다.

    // TODO:
    current.add(start);


    if (actions == -1) {        // 뒤로가기
      prevStack.push();
    }
    if (actions == 1) {             // 앞으로 가기
      prevStack.add(current);
      current.add(nextStack);
      nextStack.pop();

    }
    return result;
    return browserStack.show();
	}
}

char aString  알파벳 시작 문자열
아스키 대문자 97~122 소문자 65~90 -> if (char start >=97 && char start <=122) return true?
String.valueOf 써서 아스키 -> 문자형으로
*/