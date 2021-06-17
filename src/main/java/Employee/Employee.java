package Employee;

public class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private String address;
    private String nationalInsurance;
    private String bankAccountNumber;
    private String sortCode;
    private int salary;

    public Employee(int employeeId, String firstName, String lastName, String address, String nationalInsurance, String bankAccountNumber, String sortCode, int salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.nationalInsurance = nationalInsurance;
        this.bankAccountNumber = bankAccountNumber;
        this.sortCode = sortCode;
        this.salary = salary;
    }
}
