package day_JDBC;

import java.sql.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("请输入账号：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("请输入密码：");
        String pwd = sc.nextLine();
        DL(name, pwd);
    }

    private static void DL(String name, String pwd) {
        Connection c = null;
        Statement s = null;
        ResultSet r = null;
        PreparedStatement p = null;
        try {
            //连接数据库
            c = JDBCU.getConnection();
            //会出现SQL语句攻击的危险语句，因为可能SQL语句里面有一些SQL的关键字
//            //获取传输器
//            s = c.createStatement();
//            //执行sql
//            String sql="select *from user where username='"+name+"'and password='"+pwd+"'";
//            r = s.executeQuery(sql);
//            System.out.println(sql);
            //比较安全的写法
            //获取传输器
            String sql = "select *from user where username=? and password=?";
            p = c.prepareStatement(sql);
            p.setString(1, name);
            p.setString(2, pwd);
            //执行SQL
            r = p.executeQuery();
            //遍历结果集
            if (r.next()) {
                System.out.println("登录成功！！");
            } else {
                System.out.println("账号或者密码错误！！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            JDBCU.closes(r, s, c);
        }
    }
}
