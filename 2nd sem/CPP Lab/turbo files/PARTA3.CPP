#include<iostream.h>
#include<conio.h>
#include<string.h>
#include<iomanip.h>
class student
{
private:
char name[20],grade[20];
int rno;
int m1,m2,m3;
float avg,tot;
public:
void getdata();
void result();
void display();
};
void student::getdata()
{
cout<<"Enter the student details"<<endl;
cout<<"Enter the name: "<<endl;
cin>>name;
cout<<"Enter the roll no: "<<endl;
cin>>rno;
cout<<"Enter the marks in 3 subjects:";
cin>>m1>>m2>>m3;
}
void student::result()
{
tot=m1+m2+m3;
avg=tot/3.0;
if(m1>35&m2>35&m3>35)
{
if(avg>=70)
strcpy(grade,"distinction");
else if(avg>=60)
strcpy (grade,"first class");
else if(avg>=50)
strcpy(grade,"second class");
else
strcpy(grade,"just pass");
}
else
{
strcpy(grade,"fail");
}
}
void student::display()
{
cout<<rno<<setw(10)<<name<<setw(6)<<m1<<setw(6)<<m2<<setw(6)<<m3<<setw(6)<<tot<<setw(8)<<setprecision(2)<<avg<<setw(13)<<grade<<endl;
}
void main()
{
int n,i;
student s[20];
clrscr();
cout<<"How many students"<<endl;
cin>>n;
for(i=0;i<n;i++)
{
s[i].getdata();
s[i].result();
}
cout<<" "<<endl;
cout<<"Rno"<<setw(11)<<"Name"<<setw(4)<<" Mark1 "<<setw(4)<<"Mark2 "<<setw(4)<<"Mark3 "<<setw(4)<<"Total "<<setw(6)<<"Average "<<setw(10)<<"Grade"<<endl;
cout<<" "<<endl;
for(i=0;i<n;i++)
s[i].display();
cout<<" "<<endl;
getch();
}
/*
Output:
Enter the name:
Ritheesh
Enter the roll no:
104
Enter the marks in 3 subjects:45
36
40
Enter the student details
Enter the name:
Ram
Enter the roll no:
105
Enter the marks in 3 subjects:34
50
23

Rno       Name Mark1 Mark2 Mark3 Total Average      Grade

101   Vignesh   100   100   100   300     100  distinction
102  Prasanna    65    63    62   190   63.33  first class
103     Akash    51    54    53   158   52.67 second class
104  Ritheesh    45    36    40   121   40.33    just pass
105       Ram    34    50    23   107   35.67         fail

*/