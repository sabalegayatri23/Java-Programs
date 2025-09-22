class Employee
{
int salary=50000;
}

class Developer extends Employee
{
 int salary=75000;
 public void getSalary()
{
 System.out.println("Programmer salary is"+super.salary);
 System.out.println("developer salary is"+salary);
}
public static void main(String args[])
{
 Developer dp=new Developer();
 dp.getSalary();
}
}
