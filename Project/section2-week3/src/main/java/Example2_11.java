public class Example2_11 {                  // AOP가 적용되지 않는 JDBC 트랜잭션
    private Connection connection;

    public void registerMember(Member member, Point point) throws SQLException {
        connection.setAutoCommit(false); // 1
        try {
            saveMember(member);         // 2
            savePoint(point);           // 2

            connection.commit();        // 3
        } catch (SQLException e) {
            connection.rollback();      // 4
        }
    }

    private void saveMember(Member member) throws SQLException {
        PreparedStatement psMember =
                connection.prepareStatement("INSERT INTO member (email, password) VALUES (?, ?)");
        psMember.setString(1, member.getEmail());
        psMember.setString(2, member.getPassword());
        psMember.executeUpdate();
    }
    private void savePoint(Point point) throws SQLException {
        PreparedStatement psPoint =
                connection.prepareStatement("INSERT INTO point (email, point) VALUES (?, ?)");
        psPoint.setString(1, point.getEmail());
        psPoint.setInt(2, point.getPoint());
        psPoint.executeUpdate();
    }
}
