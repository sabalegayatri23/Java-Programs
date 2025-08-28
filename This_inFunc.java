import java.util.*;

public class This_inFunc
{

   void display()
	{
		this.show(); //Calling The show function is display function using this keyword 
		System.out.println("Entered in display Function.");
        }
  void show()
	{
		System.out.println("Enterd in Show Function");
	}

public static void main(String[] args)
	{
		This_inFunc T= new This_inFunc();
		T.display(); // Calling only display function
	}

} 