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

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNationalInsurance(String nationalInsurance) {
        this.nationalInsurance = nationalInsurance;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
