import java.sql.Connection;

public class HR extends User {
    public HR(Connection c) {
        super(c);
    }

    public String getEmployeeReport(int EmployeeID) {
        return null;
    }

    public String getEmployeeReport(String EmployeeID) {
        int emp = Integer.parseInt(EmployeeID);
        return getEmployeeReport(emp);
    }

    public String addSalesEmployee() {
        return null;
    }
}
