import java.util.*;

public class Sum_EO
{
   public static void main(String args[]){
          int num,sumE=0,sumO=0;
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter number :" );
           num=sc.nextInt();
           int[] arr=new int[num];
            for(int i=0;i<num;i++)
            {
                       arr[i]=sc.nextInt();
            }
            for(int i=0;i<num;i++)
             {
                        if(arr[i]%2==0)
				{
                                         sumE= sumE+arr[i];
                                  }
                          else 
				{
					sumO= sumO+arr[i];
				}
          }		
 	System.out.println("Sum of Even numbers : "+sumE);
        System.out.println("Sum of Odd numbers : "+sumO);
}
}