abstract class BankAC
{
public abstract void deposite();
public abstract void withdrawl();
public abstract void checkBalance();

public void getDetails()
{
 System.out.println("Get customer details like Mob no, name, email etc");
}
}
class SavingAcc extends BankAC
{
 public void deposite()
{
  System.out.println("15000 deposited");
}
public void withdrawl()
{
System.out.println("Withdrawl amount is 5000");
}
public void checkBalance()
{
 System.out.println("Available Balance is 10,000");
}
}

 class CurrentAcc extends BankAC
{
public void deposite()
{
  System.out.println("20000 deposited");
}
public void withdrawl()
{
System.out.println("Withdrawl amount is 10,000");
}
public void checkBalance()
{
 System.out.println("Available Balance is 10,000");
}
}

public class TestBalance 
{
public static void main(String args[])
{
BankAC t1=new SavingAcc();
t1.getDetails();
t1.deposite();
t1.withdrawl();
t1.checkBalance();

BankAC t2=new CurrentAcc();
t2.getDetails();
t2.deposite();
t2.withdrawl();
t2.checkBalance();
}
}


