package assignments.oops;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeID, String name) {
        super(employeeID, name);
    }

    public double calculatePay(double pay_rate)
    {
        return pay_rate*40;
    }
}
