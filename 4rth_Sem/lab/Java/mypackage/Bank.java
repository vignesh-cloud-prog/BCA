package mypackage;

public class Bank
{
long accNo;
double balance;
String name;
public Bank(long a, String n, double bal)
{
accNo=a;
name = n;
balance = bal;
}

public void deposit(double amt)
{
balance = balance + amt;
System.out.println("Your Balance: "+ balance);
}

public void withdraw(double amt)
{
if(balance-amt>1000)
{
balance=balance-amt;
System.out.println("Your Balance: "+ balance);
}
else{
System.out.println("Insufficient balance");
}
}
 
public void display()
{
System.out.println("Account No: "+ accNo);
System.out.println("Name of the customer: "+ name);
System.out.println("Balance: "+ balance);
}

}
