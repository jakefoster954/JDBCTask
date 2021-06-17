package Employee;

public class EmployeesPerDepartment {
    private int employeeID;
    private String employeeName;

    public EmployeesPerDepartment(int employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public void printEmployeePerDepartment() {
        System.out.println("------------------------");
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Employee ID: " + this.employeeName);
    }
}
