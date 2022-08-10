package Stack;
import java.util.*;

public class ImplementationQueue {
    private ArrayList<Integer> listQueue = new ArrayList<Integer>();

    public void add(Integer data) {
        listQueue.add(data);
    }

    public Integer poll() {
        if(listQueue.size()==0) {
            return null;
        }else {
            return listQueue.remove(0);
        }
    }

    public int size() {
        return listQueue.size();
    }

    public Integer peek() {
        if(listQueue.size()==0) {
            return null;
        }else {
            return listQueue.get(0);    // 리스트에서 제공하는 메서드 .get()
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }

}




