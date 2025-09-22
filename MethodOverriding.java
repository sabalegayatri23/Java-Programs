class Animal
{
void display()
{
System.out.println("Animal is moving");
}
}
class Dog extends Animal
{
void display()
{
System.out.println("Dog is moving");
}
public static void main(String args[])
{
 Dog d=new Dog();
  d.display();
  System.out.println("parent class method is:"+super.display());
}
}