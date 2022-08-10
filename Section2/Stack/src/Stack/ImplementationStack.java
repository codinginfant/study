package Stack;
import java.util.*;
public class ImplementationStack {
    private ArrayList<Integer> listStack = new ArrayList<Integer>();

    public void push(Integer data) {    // void라 return 없이 값만 넣어주면 됨
        listStack.add(data);
    }

    public Integer pop() {
        if(listStack.size()==0) {      // size 또는 isEmpty (비었을 때는 트루 아니면 엘스 리턴) 사용
            return null;
        }else {
            return listStack.remove(listStack.size()-1);    // 인덱스 0부터 시작 마지막 인덱스는 사이즈에서 -1
        }
    }

    public int size() {
        return listStack.size();
    }

    public Integer peek() {                 // 가장 나중에 추가된 데이터 하나 꺼내기 조회만 하고 삭제는 하지 않음
        if(listStack.size()==0) {
            return null;
        }else {
            return listStack.get(listStack.size()-1);
        }
    }

    public String show() {
        return listStack.toString();
    }
    public void clear() { listStack.clear(); }
}


