import java.util.*;
//No argument Constructor
public class Employee
{  
 int emp_id,salary;
     String name;
     public Employee()
     {
           emp_id=23;
           salary=20000;
           name="Siddhi";
     }
  public static void main(String[] args)
    {
          Employee e=new Employee();
          System.out.println("Employee Information:");
          System.out.println("Employee ID:"+e.emp_id);
          System.out.println("Employee name:"+e.name);
          System.out.println("Employee Salary:"+e.salary);
 

     }
}
