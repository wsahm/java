package day_JDBC;

/**
 * 自定义连接池
 */

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class Pool implements DataSource {
    static List<Connection> list = new LinkedList<>();

    static {
        for (int i = 0; i < 3; i++) {
            Connection conn = JDBCU.getConnection();
            list.add(conn);
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        Connection conn = list.remove(0);
        System.out.println("从连接池中拿走了一个对象，还剩：" + list.size());
        return conn;
    }

    public void returnConntion(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                list.add(conn);
                System.out.println("向连接池中加入一个对象，还剩：" + list.size());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
}
