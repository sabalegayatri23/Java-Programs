import java.util.*;
public class Fact
{
   public static void main(String[] args)
   {
          int fact=1,n;
          Scanner sc=new Scanner (System.in);
          n=sc.nextInt(); 
          System.out.println("Enter number : ");
          for(int i=n;i>0;i--)
          {
                fact=fact*i;
          }
    System.out.println(fact);
}
}