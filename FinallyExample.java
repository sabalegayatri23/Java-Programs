import java.util.*;
public class FinallyExample
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);

int a=s.nextInt();
int b=s.nextInt();
int c;
try
{
c=a/b;
System.out.println("Division is:"+c);
}
catch(Exception e)
{
System.out.println("You cannot divide by zero");
}
finally
{
System.out.println("The inputs are "+a+" & "+b);
}
}
}