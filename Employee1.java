import java.util.*;


public class Employee1
{  
 int emp_id,salary;
     String name;
     
     //No argument constructor
     public Employee1()
     {
           emp_id=23;
           salary=20000;
           name="Siddhi";
 }

public void disp()
{
         System.out.println("Employee Information:");
          System.out.println("Employee ID:"+emp_id);
          System.out.println("Employee name:"+name);
          System.out.println("Employee Salary:"+salary);
 
 
     }

  public static void main(String[] args)
    {
         Employee1 e=new Employee1();
          e.disp();          

     }
}
