
class Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}
class BoyFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}
class GirlFriend extends Friend {
    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다");
    }
}
public class FriendTest {
    public static void main(String[] args) {
        Friend friend = new Friend();               // 객체 타입과 참조변수 타입의 일치
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new GirlFriend();       //  객체 타입과 참조변수 타입의 불일치 -> 가능
        // 상위 클래스 타입의 참조변수를 통해서 하위 클래스의 객체를 참조

        // Friend girlfriend1 = new Friend();        -> 하위클래스 타입으로 상위클래스 객체 참조 -> 불가

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();

    }
}
