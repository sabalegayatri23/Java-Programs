public class NullPointerException
{
public static void main(String args[])
{
try{
String s=null;
System.out.println("Length of string is :"+s.length());
}
catch(Exception e)
{
System.out.println("You cannot find length of null string "+e);
}
}
}