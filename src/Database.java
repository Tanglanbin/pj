import java.sql.*;
import java.io.*;
public class Database {
    private Connection conn;
    private Statement stat;

    public Database(String url, String usr, String password, String className) {
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(url, usr, password);
            //获取数据操作的对象
            stat = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void createTable(String filename) {
        File file = new File(filename);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String sql = "";
            String tmp = "";
            while ((tmp = reader.readLine()) != null) {
                if (tmp.equals("")) {
                    stat.executeUpdate(sql);
                    sql = "";
                } else {
                    sql += tmp;
                }
            }
            stat.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {}
            }
        }
    }

    public ResultSet executeQuery(String sql) {
        try {
            return stat.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void executeUpdate(String sql) {
        try {
            stat.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void clear() {
        try {
            if (stat != null) {
                stat.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
