import java.util.*;
public class Recfact
{
public int fact(int n)
{
   int total=1;
   if(n>0)
  {
          total=n*fact(n-1);
  }
return total;
}
  

public static void main(String args[])
{
int n;
Scanner sc=new Scanner (System.in);
System.out.println("Enter Number:");
n=sc.nextInt();
Recfact f=new Recfact();
int result=f.fact(n);
System.out.println("Factorial  of given number is:"+result);
}
}