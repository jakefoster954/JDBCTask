package Employee;

public class TechnicalEmployee extends Employee{
    private String CV;
    private String passportPhoto;

    public TechnicalEmployee(int employeeId, String firstName, String lastName, String address, String nationalInsurance, String bankAccountNumber,
                             String sortCode, int salary, String CV, String passportPhoto) {
        
        super(employeeId, firstName, lastName, address, nationalInsurance, bankAccountNumber, sortCode, salary);
        this.CV = CV;
        this.passportPhoto = passportPhoto;
    }
}
