import java.util.*;
class Area
{
void arcir(float r)
{
    float result=((float)(3.14)*r*r);
    System.out.println("The area of the circle is :"+result);
}
}


public class Circ_Area
{
public static void main(String[] args){
   float radius;
Scanner sc=new Scanner(System.in);
   System.out.println("Enter the radius of the circle : ");
   radius=sc.nextFloat();
   Area obj= new Area();
   obj.arcir(radius);
}
}