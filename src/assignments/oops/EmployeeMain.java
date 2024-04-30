package assignments.oops;

public class EmployeeMain {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee=new FullTimeEmployee(171618,"Jugraj Kaur");
        PartTimeEmployee partTimeEmployee=new PartTimeEmployee(171617,"Akashpal singh");
        fullTimeEmployee.displayEmployeeInfo();
        System.out.println("Total Pay:$"+fullTimeEmployee.calculatePay(22));
        partTimeEmployee.displayEmployeeInfo();
        System.out.println("Total Pay:$"+partTimeEmployee.calculatePay(20));
    }
}
