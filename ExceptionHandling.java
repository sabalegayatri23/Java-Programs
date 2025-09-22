public class ExceptionHandling
{
public static void main(String args[])
{
int a=10;
int b=0;
int c;

int g=a+b;
System.out.println("Addition is:"+g);

try{
c=a/b;
System.out.println("Division is: "+c);
}catch(Exception e)
{
System.out.println("Exception is: "+e);
}
int s=a-b;
System.out.println("Substraction is:"+s);
}
}
