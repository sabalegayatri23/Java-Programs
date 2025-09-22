public class NFException
{
public static void main(String args[])
{
String y="abc";
try{
int a=Integer.parseInt(y);
System.out.println(a);
}
catch(Exception e)
{
System.out.println("string cannot be converted into integer " +e);
}
}
}