import java.util.*;
 public class Swap
{
public static void main(String[] args)
{
  int a,b,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Two numbers:");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("Before Swapping : A = "+a+" B= "+b);
temp=a ;
a=b;
b=temp;

System.out.println("After Swapping : A= "+a+" B= "+b);
}
}


