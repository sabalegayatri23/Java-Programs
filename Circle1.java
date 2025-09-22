class Shape
{
 public void display()
{
  System.out.println("In Shape class");
}
}
public class Circle1 extends Shape
{
 public void display()
{
  super.display();
  System.out.println("In circle class");
}
  public static void main (String args[])
{
  Circle1 c=new Circle1();
  c.display();
}
}
  