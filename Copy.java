public class Copy
{
    int emp_id;
    String name;
    public Copy(int id,String n)
    {
         emp_id=id;
         name=n;
         System.out.println("\nEmployee details :\n\nEmployee Id :"+emp_id+"\nEmployee name :"+name);
    }
  
   public Copy(Copy obj)
   {
         emp_id=obj.emp_id;
         name=obj.name;
          System.out.println("\nEmployee details :\n\nEmployee Id :"+emp_id+"\nEmployee name :"+name);


}

public static void main(String[] args)
{
      Copy e=new Copy(101,"Siddhi");
      Copy c=new Copy(e);

}
}
