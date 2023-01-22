import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    private Connection conn;
    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/MySQL";
    private final String USER_NAME = "root";
    private final String PASSWORD = "";

    public DBManager() {
        try {
            System.out.println("생성자");
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/MySQL", "", "");
            System.out.println("드라이버 로딩 성공");
        } catch (Exception var4) {
            System.out.println("드라이버 로딩 실패 ");

            try {
                this.conn.close();
            } catch (SQLException var3) {
            }
        }

    }

    public void DBTableCreate() {
        String sql = "CREATE TABLE IF NOT EXISTS TEST_DBTABLE(ID varchar(200), name varchar(20));";

        try {
            Statement st = this.conn.createStatement();
            st.execute(sql);
        } catch (SQLException var3) {
            System.out.println("SQL 오류");
            var3.printStackTrace();
        }

    }

    public void DBInput(String id, String name) {
        String sql = "INSERT INTO TEST_DBTABLE VALUES(\"" + id + "\"" + ", \"" + name + "\");";

        try {
            Statement st = this.conn.createStatement();
            st.execute(sql);
        } catch (SQLException var5) {
            System.out.println("SQL 오류");
            var5.printStackTrace();
        }

    }
}
