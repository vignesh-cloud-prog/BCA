#include<iostream.h>
#include<iomanip.h>
#include<string.h>
#include<conio.h>
#include<stdio.h>
int units,tarif;
float amount;
class electricity
{
protected:
char tarifcode[5];
char zone[5];
float mno;
};
class customer:public electricity
{
int accountid;
char custname[25];
char address[50];
int prev_read;
int cur_read;
public:
void getinput();
void calculatebill();
void display();
};
void customer::getinput()
{
cout<<"\n Enter account id:";
cin>>accountid;
cout<<"\n Enter meter no:";
cin>>mno;
cout<<"\n Enter customer name:";
gets(custname);
cout<<"\n Enter customer address:";
gets(address);

do
{
cout<<"\n Enter previous meter reading:";
cin>>prev_read;
cout<<"\n Enter current meter reading:";
cin>>cur_read;
if(cur_read<prev_read)
cout<<"\n Wrong input.....! Current reading should be greater then previous reading \n";
}while(cur_read<prev_read);

cout<<"\n Enter tarrif code(LT1/LT2/LT3)";
cin>>tarifcode;
cout<<"Enter zone(RURAL/URBAN)";
cin>>zone;
}
void customer::calculatebill()
{
units=cur_read-prev_read;
amount=200;
if((strcmpi(tarifcode,"LT1")==0)) tarif=0;
else if((strcmpi(tarifcode,"LT2")==0)) tarif=1;
else tarif=2;
switch(tarif)
{
case 0:
if(units<=40&&units>=0)
amount+=units*6.80;
else
amount+=40*6.80+(units-40)*7.0;
break;
case 1:
if(amount>=0&&units<=30)
{
if(!strcmpi(zone,"RURAL"))
amount+=units*3.4;
else
amount+=units*3.55;
}
else if(units>30&&units<=100)
{
if(!strcmpi(zone,"RURAL"))
amount+=30*3.4+(units-30)*4.65;
else
amount+=30*3.55+(units-30)*4.95;
}
else if(units>100)
{
if(!strcmpi(zone,"RURAL"))
amount+=30*3.4+70*4.65+(units-100)*6.2;
else
amount+=30*3.55+70*4.95+(units-100)*6.7;
}
break;
case 2:
if(amount>=0&&units<=50)
{
if(!strcmpi(zone,"RURAL"))
amount+=units*7.25;
else
amount+=units*7.75;
}
else if(units>50)
{
if(!strcmpi(zone,"RURAL"))
amount+=50*7.25+(units-50)*8.55;
else
amount+=50*7.75+(units-50)*8.95;
}
break;
}
}
void customer::display()
{
cout<<"\n Meter No :"<<mno;
cout<<"\n Customer Account Id :"<<accountid;
cout<<"\n Cusomer Name :"<<custname;
cout<<"\n Customer Address:"<<address;
cout<<"\n Tarif Code :"<<tarifcode;
cout<<"\n Zone :"<<zone;
cout<<"\n Previous Reading :"<<prev_read;
cout<<"\n Current Reading :"<<cur_read;
cout<<"\n No. of Units Consumed :"<<units;
cout<<"\n Total Amount to Pay(in rupees) :"<<setprecision(2)<<amount;
}
void main()
{
clrscr();
int wish=1;
customer c;
do
{
c.getinput();
c.calculatebill();
c.display();
cout<<"\n Do you wish to continue ? Enter 0 for No,1 for Yes ;";
cin>>wish;
}while(wish==1);
getch();
}




