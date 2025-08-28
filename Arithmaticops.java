import java.util.*;

public class Arithmaticops
{
     public static void main(String args[])
     {       
            int sum,sub,Mul,div;
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter 1st number : ");
              int a=sc.nextInt();
             System.out.print("Enter 2nd number : ");
int b=sc.nextInt();
 sum= a+b;
System.out.println("The addition is:"+sum);
 sub=a-b;
System.out.println("The Substraction is:"+sub);
 Mul=a*b;
System.out.println("The Multiplicaton is:"+Mul);
if(b==0)
{
    System.out.println("Output Can't be fetched as the denominator is zero!");
}
else{
div=a/b;
 System.out.println("The Division is:"+div);
}
           

}
}
   
     
