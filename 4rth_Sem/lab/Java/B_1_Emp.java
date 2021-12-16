import java.util.Scanner;

class Member
{
String name;
int age;
String phone_no;
String place;
long salary;
public void readMemData()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter employee's name, age, phone number, place and salary");
name=sc.next();
age=sc.nextInt();
phone_no=sc.next();
place=sc.next();
salary=sc.nextLong();
}
public void printMemData()
{
System.out.println("Name : "+name);
System.out.println("Age: "+age);
System.out.println( "Phone No :"+phone_no);
System.out.println("Place: "+place);
}
public void printSalary()
{
System.out.println("salary:"+salary);
}
}
class Employee extends Member
{
String specialization;
void readEmpSp()
{
readMemData();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Specialisation: ");
specialization=sc.nextLine();
}
void printEmpSp()
{
printMemData();
System.out.println("Specialization: "+ specialization);
}
}
class Manager extends Member
{
String dept;
void readManDept(){
readMemData();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the department: ");
dept=sc.nextLine();
}
void printManDept()
{
printMemData();
System.out.println("Department :" +dept);
}
}
class B_1_Emp
{
public static void main(String args[])
{
Employee e1=new Employee();
Manager m1=new Manager();
System.out.println("Employee Details");
e1.readEmpSp();
e1.printEmpSp();
e1.printSalary();
System.out.println("Manager Details");
m1.readManDept();
m1.printManDept();
m1.printSalary();
}
}