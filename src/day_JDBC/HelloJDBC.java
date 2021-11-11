package day_JDBC;
/**
 *
 */

import java.sql.*;

public class HelloJDBC {
//    @Test
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        try {
            //注册驱动
//        DriverManager.registerDriver(new Driver());
            Class.forName("com.mysql.jdbc.Driver");
            //获取数据库连接
            String url = "jdbc:mysql://localhost:3306/jt_db";
            String user = "root";
            String password = "wsahm1314";
            c = DriverManager.getConnection(url, user, password);
            //获取传输器
            s = c.createStatement();
            //执行sql语句
            String sql = "select *from account";
            r = s.executeQuery(sql);
            //遍历结果
            while (r.next()) {
                String id = r.getString(1);
                String name = r.getString(2);
                String money = r.getString(3);
                System.out.println("id=" + id + "，name=" + name + "，money=" + money);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            if (r != null) {
                try {
                    r.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    r = null;
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    s = null;
                }
            }
            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                } finally {
                    c = null;
                }
            }
        }
    }
}
