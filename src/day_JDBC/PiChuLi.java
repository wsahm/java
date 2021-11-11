package day_JDBC;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PiChuLi {
    public static void main(String[] args) {
        Pool p = new Pool();
        Connection conn = null;
        PreparedStatement p1 = null;
        try {
            long stat = System.currentTimeMillis();
            conn = p.getConnection();
            conn.setAutoCommit(false);//关闭数据库自动提交事务，
            String sql = "insert into dept values (null,?)";
            p1 = conn.prepareStatement(sql);
            for (int i = 0; i < 100; i++) {
                String c = String.valueOf(i);
                p1.setString(1, c);
                p1.addBatch();//将数据打成一批，减少数据库的连接次数
            }
            p1.executeBatch();//提交打成一批的数据
            conn.commit();//提交事务
            long l = System.currentTimeMillis() - stat;
            System.out.println(l);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCU.closes(null, p1, null);
            p.returnConntion(conn);
        }
    }
}
