#include<iostream.h>
#include<iomanip.h>
#include<conio.h>
class personal
{
protected:
char name[50];
char address[50];
char gender;
public:
void getpersonal()
{
cout<<"\nEnter the personal info:\n";
cout<<"\nEnter employee name:";
cin>>name;
cout<<"\nEnter the address:";
cin>>address;
cout<<"\nEnter the gender:";
cin>>gender;
}
void putpersonal()
{
cout<<setw(10)<<endl<<"Name:"<<name<<endl;
cout<<setw(10)<<endl<<"Address:"<<address<<endl;
cout<<setw(10)<<endl<<"Gender:"<<gender<<endl;
}
};
class physical
{
protected:
float height,weight;
char bg[5];
public:
void getphysical()
{
cout<<"\nEnter the personal info:\n";
cout<<"\nEnter the height:";
cin>>height;
cout<<"\nEnter the weight:";
cin>>weight;
cout<<"\nEnter the blood group:";
cin>>bg;
}
void putphysical()
{
cout<<setw(10)<<endl<<"Height:"<<height<<endl;
cout<<setw(10)<<endl<<"Weight:"<<weight<<endl;
cout<<setw(10)<<endl<<"B-Group:"<<bg<<endl;
}
};
class salary:public personal,public physical
{
private:
int eno;
char dept;
float inc,salary;
public:
void getsalary()
{
personal::getpersonal();
physical::getphysical();
cout<<endl<<"\n Enter the salary info:";
cout<<"\nEnter employee number:";
cin>>eno;
cout<<"Enter the salary:";
cin>>salary;
cout<<"Enter the department:";
cin>>dept;
}
void putsalary()
{
personal::putpersonal();
physical::putphysical();
cout<<setw(10)<<endl<<"Emp No:"<<eno<<endl;
cout<<setw(10)<<endl<<"Department:"<<dept<<endl;
cout<<setw(10)<<endl<<"Salary:"<<salary<<endl;
}
void inc_sal()
{
if(dept=='p'||dept=='s'||dept=='P'||dept=='s')
{
if(gender=='m'||gender=='M')
salary+=salary*0.1;
else
salary+=salary*0.11;
}
}
};
void main()
{
salary s;
clrscr();
s.getsalary();
s.inc_sal();
s.putsalary();
getch();
}
