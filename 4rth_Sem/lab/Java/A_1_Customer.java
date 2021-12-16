import java.io.*;
import java.math.*;
class A_1_Customer
{
public static void main(String args[])
{
float totalVal=0;
float totalDis=0;
float mValue=0;
float hValue=0;
float mDiscount =0;
float hDiscount =0;
int ch;
try
{
do
{
mDiscount =0;
hDiscount =0;
System.out.println("\n========================================");
System.out.println(" MENU ");
System.out.println("========================================");
System.out.println("1.Enter value of mill item");
System.out.println("2.Enter value of handloom item");
System.out.println("3.Net value of item for customer");
System.out.println("4.Exit");
System.out.println("========================================");
System.out.print("Enter your choice: ");
BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
System.out.print("Enter Purchase value of mill item: ");
mValue=Float.parseFloat(in.readLine());
if(mValue<250 && mValue>0)
mDiscount=mDiscount+mValue*0.0f;
else if(mValue<=500 && mValue>=251)
mDiscount=mDiscount+mValue*0.050f;
else if(mValue<=750 && mValue>501)
mDiscount=mDiscount+mValue*0.075f;
else if(mValue>750)
mDiscount=mDiscount+mValue*0.10f;
else
mDiscount=mDiscount+mValue*0.0f;
System.out.println("\n The purchase value for mill item of the customer is "+mValue+" and discount amount is "+mDiscount);
totalVal+=mValue;
totalDis+=mDiscount;
break;
case 2:
System.out.print("Enter Purchase value of handloom item: ");
hValue=Float.parseFloat(in.readLine());
if(hValue<250 && hValue>0)
hDiscount =hDiscount +hValue*0.05f;
else if(hValue<=500 && hValue>=251)
hDiscount =hDiscount +hValue*0.075f;
else if(hValue<=750 && hValue>501)
hDiscount =hDiscount +hValue*0.10f;
else if(hValue>750)
hDiscount=hDiscount +hValue*0.15f;
else
hDiscount=hDiscount +hValue*0.0f;
System.out.println("\nThe purchase amount for handlooom item of the customer is "+hValue+" & discountamount is "+hDiscount);
totalVal+=hValue;
totalDis+=hDiscount;
break;
case 3:
double netValue = (double)( totalVal - totalDis);
System.out.println("Total Item Purchase value of the customer is "+totalVal+" & discount is "+totalDis+"\n");
System.out.println("Net amount to be paid by the customer is "+ netValue +"\n");

break;
case 4:
System.exit(0);
default:
System.out.println("Invalid Choice! Try again");
break;
}

}
while(ch!=4);
}
catch(Exception e)
{
System.out.println(e);
}
}
}