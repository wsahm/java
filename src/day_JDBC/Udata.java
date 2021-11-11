package day_JDBC;

import day_动态编程.Runner;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Udata {
    public static void main(String[] args) {
        Connection c = null;
        Statement s = null;
        try {
            String path = Runner.class.getResource("/day_JDBC/jdbc.txt").getPath();//获得cfg.txt的路径
            path = URLDecoder.decode(path, "utf-8");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line;
            List<String> a = new ArrayList<>();
            while ((line = in.readLine()) != null) {
                a.add(line);
            }
//            ResourceBundle rb=ResourceBundle.getBundle("jdbc1");
            //注册驱动
//            Class.forName(rb.getString("driverclass"));
            //连接数据库
//            String url=rb.getString("url");
//            String user=rb.getString("user");
//            String password=rb.getString("password");
            Class.forName(a.get(0));
            String url = a.get(1);
            String user = a.get(2);
            String password = a.get(3);
            c = DriverManager.getConnection(url, user, password);
//            c=JDBCU.getConnection();
            //获取传输器
            s = c.createStatement();
            //执行sql
            String sql = "insert into user values(null,'唐伯虎','123456')";
            long l = s.executeLargeUpdate(sql);
            System.out.println(l);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            if (s!=null) {
//                try {
//                    s.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }finally {
//                    s=null;
//                }
//            }
//            if (c!=null) {
//                try {
//                    c.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }finally {
//                    c=null;
//                }
//            }
            JDBCU.closes(null, s, c);
        }

    }
}
