import java.util.Scanner;

public class B_2_Abclass
{
public static void main(String args[])
{
Rectangle r = new Rectangle();
Triangle t = new Triangle();
Ellipse e = new Ellipse();
int v1, v2;
Scanner sc = new Scanner(System.in);
System.out.print("Enter Length and Width of a rectangle: ");
v1=sc.nextInt();
v2=sc.nextInt();
r.printArea(v1, v2);
System.out.print("Enter Base and Height of Triangle: ");
v1=sc.nextInt();
v2=sc.nextInt();
t.printArea(v1, v2);
System.out.print("Enter Axis values of Ellipse: ");
v1=sc.nextInt();
v2=sc.nextInt();
e.printArea(v1, v2);
sc.close();
}
}

abstract class Shape
{
int h=0,w=0;
abstract void printArea(int h, int w);
}

class Rectangle extends Shape
{
void printArea(int a, int b)
{
this.h=a;
this.w=b;
float area=h*w;
System.out.println("The area of rectangle is "+ area);
}
}

class Triangle extends Shape
{
void printArea(int a , int b)
{
this.h=a;
this.w=b;
float area=0.5f*h*w;
System.out.println("The area of Triangle is "+ area);
}
}

class Ellipse extends Shape
{
void printArea(int a , int b)
{
this.h=a;
this.w=b;
float area=3.14f*h*w;
System.out.println("The area of Ellipse is "+ area);
}
}
