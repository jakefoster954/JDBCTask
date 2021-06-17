package Menu;

import Employee.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class ConnectionToDb {
    private static Connection conn;

//    public void simpleQuery() {
//        try {
//            Connection c = getConnection();
//            Statement st = c.createStatement();
//            ResultSet rs = st.executeQuery(
//                    "SELECT emp_no AS `number`, "
//                            + "CONCAT_WS (' ', first_name, last_name) AS `name`, "
//                            + "salary * 100 AS `salary` "
//                            + "FROM employees JOIN salaries USING(emp_no) "
//                            + "WHERE to_date > NOW() AND salary = 100000");
//
//            while (rs.next()) {
//                Employee dbEmp = new Employee(10, );
//                System.out.println(dbEmp);
//            }
//        } catch (SQLException | IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static Connection getConnection() throws IOException {
        String user;
        String password;
        String host;

        try {
            InputStream propsStream = new FileInputStream("groupIdb.properties");
            Properties props = new Properties();
            props.load(propsStream);
            user            = props.getProperty("user");
            password        = props.getProperty("password");
            host            = props.getProperty("host");

            if (user == null || password == null || host == null)
                throw new IllegalArgumentException(
                        "Properties file must exist and must contain "
                                + "user, password, and host properties.");

            if (conn != null) {
                return conn;
            }

            conn = DriverManager.getConnection("jdbc:mysql://"
                    + host + "/groupi_AnnaP?useSSL=false", user, password);
            return conn;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}