import java.util.Scanner;

class Student
{
int rollNo;
String name, cls;
void getData(int n , String nm, String c)
{
rollNo= n;
name=nm;
cls=c;
}
void putData()
{
System.out.println("\nStudent details: "); 
System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
System.out.println("Class: " + cls);
}
}

class Test extends Student
{
int mark1, mark2, mark3;
void getMarks(int m1,int m2,int m3)
{
mark1=m1;
mark2=m2;
mark3=m3;
}
void putMarks()
{
System.out.println("\nMarks obtained: ");
System.out.println("Subject 1: " + mark1);
System.out.println("Subject 2: " + mark2);
System.out.println("Subject 3: " + mark3);
}
}

interface Sports
{
int sportsWt=5;
void putWt();
}

class Result extends Test implements Sports
{
int total;
public void putWt()
{
System.out.println("Sports Weight: " + sportsWt);
}
void display()
{
total=mark1+mark2+mark3+sportsWt;
putData();
putMarks();
putWt();
System.out.println("Total Score: "+ total);
}
}
class B_3_Student
{
public static void main(String args[])
{
Result r1= new Result();
int m1,m2,m3,rno;
String nm,cl;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Roll No, Name and Class of the student");
rno=sc.nextInt();
nm=sc.nextLine();
cl=sc.nextLine();
System.out.println("Enter marks in three subjects: ");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
r1.getData(rno,nm,cl);
r1.getMarks(m1,m2,m3);
r1.display();
}
}
