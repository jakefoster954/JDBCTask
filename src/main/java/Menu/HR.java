package Menu;

import Employee.EmployeesPerDepartment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HR extends User {
    public HR(Connection c) {
        super(c);
    }

    public String getEmployeeReport(int EmployeeID) throws SQLException {
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery("SELECT Employee.EmployeeID, CONCAT(Fname, ' ', Lname) " +
                "AS Name FROM Employee WHERE Employee.EmployeeID IN (SELECT EmployeeID FROM SalesEmployee)");
//        ResultSet rs = st.executeQuery("select * from Employee");
        while (rs.next()) {
            int employeeId =  rs.getInt("EmployeeID");
            String employeeName =  rs.getString("Name");

            EmployeesPerDepartment employees = new EmployeesPerDepartment(employeeId,employeeName);
            employees.printEmployeePerDepartment();
        }
        return null;
    }

    public String getEmployeeReport(String EmployeeID) throws SQLException {
        int emp = Integer.parseInt(EmployeeID);
        return getEmployeeReport(emp);
    }

    public String addSalesEmployee() {
        return null;
    }
}
