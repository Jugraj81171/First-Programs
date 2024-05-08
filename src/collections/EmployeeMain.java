package collections;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("Jugraj","jugrajkaur970@gmail.com",10,"India"));
        employeeList.add(new Employee("jagroop","jukaur970@gmail.com",30,"canada"));
        employeeList.add(new Employee("hardeep","hardeepkaur970@gmail.com",40,"pakistan"));
        employeeList.add(new Employee("manpreet","manpreet970@gmail.com",50,"India"));
        //employees greater than age 35

        for(Employee e: employeeList)
        {
            if (e.getAge()>35){
                e.employeeInfo();
            }
        }
    }
}
