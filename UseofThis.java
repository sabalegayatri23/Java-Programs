import java.util.*;

public class UseofThis
{
    int roll;
    String name;
    int marks;
   
    UseofThis(int roll,String name,int marks)
       	{
		
                this.roll=roll;                                 		
		this.name=name;                             
		this.marks=marks;            
               

                 /*
                   //Without using this (outputs are 0,null,0)
                     roll=roll;
                     name=name;
		     marks =marks  ;
                  */

	}

     void Display()
	{
 		System.out.println("\nStudent Details :");
		System.out.println("\nName : "+name+"\nRoll no : "+roll+"\nMarks : "+marks );
	}
 
 public static void main(String[] args)
    {
		UseofThis s=new UseofThis(96,"Siya",86);	
		s.Display();
     }


}