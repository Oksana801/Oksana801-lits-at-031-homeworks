

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

    public class dB {

        public static  void main(String[] args) {
            final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

            String url ="jdbc:mysql://localhost:3306/db"
                  + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
             String user = "root";
             String password = "Stories123";
            Connection conn = null;
            Statement stmt = null;
            try {
                Connection myConn = DriverManager.getConnection(url, user, password);
                Statement myStmt = myConn.createStatement();
                String sql = "select * from db.employee";
                ResultSet rs = myStmt.executeQuery(sql);

                List<Employee> employeeList =new ArrayList<Employee>();
                while (rs.next())
                    employeeList.add(new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("dob"), rs.getString("email")));

                for (Employee employee : employeeList) {
                    System.out.println(employee);
                }

            }catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (stmt != null)
                        stmt.close();
                } catch (SQLException se2) {

                }
                try {
                    if (conn != null)
                        conn.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            System.out.println("STAFF");
            }
            }
