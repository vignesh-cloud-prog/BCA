import mypackage.Bank;
import java.util.Scanner;

class Account
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int choice= 0;
long ac;
String nm;
double amt,id;
System.out.println("Enter A/c No: ");
ac=sc.nextLong();
System.out.println("Enter the name: ");
nm=sc.next();
System.out.println("Enter the initial balance: ");
id=sc.nextDouble();
Bank b1= new Bank(ac,nm,id);
while(choice<=3)
{
System.out.println("MENU");
System.out.println("1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
System.out.println("Enter your choice: ");
choice = sc.nextInt();
switch(choice)
{
case 1:
System.out.println("Enter the amount to be deposited: ");
amt= sc.nextInt();
b1.deposit(amt);
break;

case 2:
System.out.println("Enter the amount to be withdrawn: ");
amt= sc.nextInt();
b1.withdraw(amt);
break;

case 3:
b1.display();
}
}
}
}

