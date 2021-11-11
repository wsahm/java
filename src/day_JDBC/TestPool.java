package day_JDBC;


import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 测试自定义连接池
 */

public class TestPool {
    public static void main(String[] args) {
//        Pool p = new Pool();//自定义连接池
        ComboPooledDataSource p = new ComboPooledDataSource();//c3p0连接池
        Connection conn = null;
        PreparedStatement p1 = null;
        try {
            //1.注册驱动 2.连接数据库
           /* p.setDriverClass("com.mysql.jdbc.Driver");
            p.setJdbcUrl("jdbc:mysql:///jt_db");
            p.setUser("root");
            p.setPassword("wsahm1314");*/
            conn = p.getConnection();
            String sql = "delete from user where id= ?";
            p1 = conn.prepareStatement(sql);
            p1.setString(1, "4");
            p1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            JDBCU.closes(null,p1,null);
//            p.returnConntion(conn);
            JDBCU.closes(null, p1, conn);
        }
    }
}
