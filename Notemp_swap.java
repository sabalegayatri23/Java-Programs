import java.util.*;
 public class Notemp_swap
{
public static void main(String[] args)
{
  int a,b,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Two numbers:");
  a=sc.nextInt();
  b=sc.nextInt();
  System.out.println("Before Swapping : A = "+a+" B= "+b);
   a=a+b;
   b=a-b;
   a=a-b;

  System.out.println("After Swapping : A= "+a+" B= "+b);
}
}


