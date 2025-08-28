import java.util.*;

class Area
{
     void tri_area(double b,double h)
      {
            double result =0.5*b*h;
            System.out.println("The Area of the triangle is :"+result );
   }
}

public class Triarea
{
     public static void main(String args[])
     {
            double b,h;
           Scanner sc=new Scanner(System.in);
           Area a=new Area();
           System.out.println("Enter the Base :");
           b=sc.nextDouble();
           System.out.println("Enter the Height :");
           h=sc.nextDouble();
           a.tri_area(b,h);
     }
}