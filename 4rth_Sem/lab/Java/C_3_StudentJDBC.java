import java .io.*;
import java.sql.*;
public class C_3_StudentJDBC
{
public static void main(String args[])
{
DataInputStream in=new DataInputStream(System.in);
String query=new String();
String Reg=new String();
String nm=new String();
String Cls=new String();
int m1,m2,n,choice=0;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

Connection con=DriverManager.getConnection("jdbc:odbc:std");

PreparedStatement ps1=con.prepareStatement("Insert into std values (?,?,?,?,?)");
PreparedStatement ps2=con.prepareStatement("select * from std where Regno=?");
PreparedStatement ps3=con.prepareStatement("delete from std where Regno=?");
ResultSet rs;
do
{
System.out.println("Menu");
System.out.println("1.Insert\n2. Display\n3. Delete");
System.out.println("4.Exit");
System.out.print("Enter your choice : ");
choice=Integer.parseInt(in.readLine());
switch(choice)
{

case 1:System.out.print("Enter Reg. No., Name and Class and Marks in two subjecs : ");

Reg=in.readLine();
nm=in.readLine();
Cls=in.readLine();
m1=Integer.parseInt(in.readLine());
m2=Integer.parseInt(in.readLine());
ps1.setString(1,Reg);
ps1.setString(2,nm);
ps1.setString(3,Cls);
ps1.setInt(4,m1);
ps1.setInt(5,m2);
n=ps1.executeUpdate();
System.out.println("One Row Created.......");
break;

case 2:System.out.print("Enter the Rigister Number : ");
Reg=in.readLine();
ps2.setString(1,Reg);
rs=ps2.executeQuery();
if(rs.next())
{
System.out.println("----------------------------------");
System.out.println("Name : "+rs.getString(2));
System.out.println("Class : "+rs.getString(3));
System.out.println("Mark 1 : "+rs.getInt(4));

System.out.println("Mark 2 : "+rs.getInt(5));
System.out.println("----------------------------------");
}
else
System.out.println("No record found.......");
break;

case 3:System.out.print("Enter the Rigister Number : ");
Reg=in.readLine();
ps2.setString(1,Reg);
rs=ps2.executeQuery();
if(rs.next())
{
ps3.setString(1,Reg);
n=ps3.executeUpdate();
System.out.println("Record Deleted.......");
}
else
System.out.println("No reord found.......");

}
}while(choice<4);
ps1.close();
ps2.close();
ps3.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}