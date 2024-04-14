public class EmployeePayroll {
   /* Create an EmployeePayroll class with properties like employeeId, employeeName, basicSalary, and designation.
   Write a constructor to initialize these properties when instantiating an EmployeePayroll object.
    Implement methods to calculate the gross salary, deductions, and net salary.*/
    int employeeId;
    String employeeName;
    int basicSalary;
    String designation;
    double grossSalary = 0;
    double deductions= 0;
    public EmployeePayroll(int employeeId,String employeeName ,int basicSalary,String designation ){
        this.employeeId =employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;


    }
    public void show( ){
        System.out.println("****************");
        System.out.println("welcome to Employee Payroll System");
        System.out.println("employeeId : "+employeeId);
        System.out.println("  employeeName : "+employeeName);
        System.out.println("basicSalary : "+"$"+basicSalary);
        System.out.println("designation : "+designation);
        System.out.println("*****************");

    }
    public double calGrossSalary(int total_hours,int payrate){
        double grossSalary = total_hours* payrate;
        System.out.println("Gross Salary:"+ "$"+grossSalary);
        return grossSalary;
    }
    public double calDeductions(int tax){

            double deductions = grossSalary * ((double) tax /100);
            System.out.println("Deductions: "+ "$"+deductions);
            return deductions;

    }
    public double calNetSalary(){
        grossSalary = calGrossSalary(double grossSalary);
         deductions= calDeductions(double deductions);
         double netpay = grossSalary  - deductions;
        System.out.println("netpay :"+netpay);
        return netpay;

    }
    public static void main(String[] args) {
        EmployeePayroll employee = new EmployeePayroll(171618,"Jugraj",40000,"Material Handler");
        employee.show();
        employee.calGrossSalary(40,19);
        employee.calDeductions(13);
        employee.calNetSalary();
    }
}

