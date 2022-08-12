@Component
@Transactional

public class Example2_12 {
    private Connection connection;

    public void registerMember(Member member, Point point) throws SQLException {
        saveMember(member);
        savePoint(point);
    }

    private void saveMember(Member member) throws SQLException {
        // Spring JDBC를 이용한 회원 정보 저장
    }

    private void savePoint(Point point) throws SQLException {
        // Spring JDBC를 이용한 포인트 정보 저장
    }
}
