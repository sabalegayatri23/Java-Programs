 abstract class Animal
{
public abstract void voice();
public void eat()
{
System.out.println("In eat method");
}
}
public class Cat extends Animal
{
 public void voice()
{
  System.out.println("In cat voice");
}
public static void main(String args[])
{
Cat c1=new Cat();
c1.voice();
c1.eat();
}
}
