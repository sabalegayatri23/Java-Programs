interface Father
{
 public void bringwater();
}
interface Mother
{
public void bringwater();
}
public class Son implements Father, Mother
{
 public void bringwater()
{
System.out.println("Brought water for father and mother");
}

class Grandson1 extends Son
{
public void name()
{
System.out.println("ABC");
}
}
class Grandson2 extends Son
{
public void name()
{
System.out.println("PQR");
}
}
public static void main(String args[])
{
Son s=new Son();
s.bringwater(); 
Grandson1 g1=new Grandson1();
g1.name();
Grandson2 g2=new Grandson2();
g2.name();
}
}