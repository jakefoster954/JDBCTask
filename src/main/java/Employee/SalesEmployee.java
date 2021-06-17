package Employee;

public class SalesEmployee extends Employee{
    private double commissionRate;
    private int totalSales;

    public SalesEmployee(int employeeId, String firstName, String lastName, String address, String nationalInsurance, String bankAccountNumber, String sortCode, int salary, double commissionRate, int totalSales) {
        super(employeeId, firstName, lastName, address, nationalInsurance, bankAccountNumber, sortCode, salary);
        this.commissionRate = commissionRate;
        this.totalSales = totalSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public int getTotalSales() {
        return totalSales;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
}
