public class Shape
{
 public  double area()
{
  int b;
  int h;
  double a=0.5*b*h;
  System.out.println("Area of triangle is :"+a);
}

public double area(int r)
{
 double a=3.14*r*r;
 return a;
}
public double area(int b, int h)
{
double a=b*h;
return a;
}
public static void main(String args[])
{
Shape s=new Shape();
s.area();
System.out.println("area of triangle is:"+s.area());
System.out.println("area of circle is:"+s.area(7));
System.out.println("area of triangle is:"+s.area(10,20));

}
}