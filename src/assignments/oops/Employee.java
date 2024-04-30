package assignments.oops;

public class Employee {
    int employeeID;
    String Name;
    double pay_rate;

    public Employee(int employeeID, String name) {
        this.employeeID = employeeID;
        Name = name;
    }

    public void displayEmployeeInfo(){
        System.out.println("Name of Employee:"+employeeID);
        System.out.println("Name of Employee:"+Name);
    }
    public double calculatePay(double pay_rate)
    {
        return 0;
    }
}
