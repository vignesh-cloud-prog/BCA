import java.io.*; 
import java.util.*; 

class First extends Thread 
{ 
public void run() 
{ 
for(;;) 
{ 
int r; 
Random d = new Random(); 
r = d.nextInt(200) + 1; 
try 
{ 
Thread.sleep(1000); 
if(r%2==0) 
{ 
Thread t2=new Second(r); 
t2.start(); 
} 
else 
{ 
Thread t3=new Third(r); 
t3.start(); 
}
} 
} 
catch(InterruptedException e) 
{} 
}}} 

class Second extends Thread 
{ 
int r1; 
Second(int r) 
{ 
r1=r; 
} 
public void run() 
{ 
System.out.println("The square of number "+r1+" is: "+r1*r1); 
} 
} 

class Third extends Thread 
{ 
int r1; 
Third(int r) 
{ 
r1=r; 
} 
public void run() 
{ 
System.out.println("The Cube of the Number "+r1+" is: "+r1*r1*r1); 
} 
}

class B_5_Mthread 
{ 
public static void main(String[] args) { 
Thread t1=new First(); 
System.out.println("press Ctrl+c to stop......"); 
t1.start(); 
} 
}
