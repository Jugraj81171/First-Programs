package assignments.oops;

public class PartTimeEmployee  extends Employee{
    public PartTimeEmployee(int employeeID, String name) {
        super(employeeID, name);
    }

    public double calculatePay(double pay_rate)
    {
    return pay_rate*20;
    }
}
