import java.util.Scanner;

public class Pay
{
String name;
double salary, da, hra, pf, grossSal, netSal;

public Pay(String n, double s)
{
name = n;
salary = s;
da=hra=pf=grossSal=netSal=0;
}

void calculate()
{
da=salary*15.0/100;
hra=salary*10.0/100;
pf=salary*12.0/100;
grossSal=salary+da+hra;
netSal=grossSal-pf;
}

void display()
{
System.out.println("Employee Name: " + name);
System.out.println("Salary: " + salary );
System.out.println("Dearness Allowance: " + da);
System.out.println("House Rent Allowances: " + hra);
System.out.println("Provident Fund: " + pf);
System.out.println("Gross Salary: " + grossSal);
System.out.println("Net Salary: " + netSal);
}

public static void main(String args[])
{
Scanner in = new Scanner(System.in);
System.out.println("Enter Employee name: ");
String empName= in.nextLine();
System.out.println("Enter Salary: ");
double empSal= in.nextDouble();
Pay obj = new Pay(empName, empSal);
obj.calculate();
obj.display();
}
}

