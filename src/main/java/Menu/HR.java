package Menu;

import Employee.Employee;
import Employee.SalesEmployee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.List;

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
            int a =  rs.getInt("EmployeeID");
            System.out.println(a);
        }
        return null;
    }

    public String getEmployeeReport(String EmployeeID) throws SQLException {
        int emp = Integer.parseInt(EmployeeID);
        return getEmployeeReport(emp);
    }

    public String addSalesEmployee(SalesEmployee obj) throws SQLException {
        Statement st = c.createStatement();
        st.executeUpdate(String.format("INSERT into Employee (EmployeeID, Fname, Lname, Address, NIN, SortCode, BankAccount) VALUES (%d, %s, %s, %s, %s, %s, %s)",
                obj.getEmployeeId(), obj.getFirstName(), obj.getLastName(), obj.getAddress(), obj.getNationalInsurance(), obj.getSortCode(),
                obj.getBankAccountNumber()));
        st.executeUpdate(String.format("INSERT into SalesEmployee (EmployeeID, CommissionRate, TotalSales) " +
                "VALUES (%d, %2.2f, %d)", obj.getEmployeeId(), obj.getCommissionRate(), obj.getTotalSales()));
        System.out.println("Employee added successfully");
        return null;
    }
}
