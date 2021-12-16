#include<iostream.h>
#include<conio.h>
#include<iomanip.h>
#include<string.h>
#include<stdio.h>
class item
{
protected: int itemno;
float price;
char title[30];

public: void getdata()
{
cout<<"Enter the item no:"<<endl;
cin>>itemno;
cout<<"Enter price:"<<endl;
cin>>price;
cout<<"Enter the title:"<<endl;
cin>>title;
}
void display()
{
cout<<"The item:"<<itemno<<endl;
cout<<"The price:"<<price<<endl;
cout<<"The title:"<<title<<endl;
}
};
class book:public item
{
protected:
char author[20];
char pub[20];
int pages,no;
public:void book_info()
{
cout<<"Enter the name of the author:"<<endl;
cin>>author;
cout<<"Enter the publication:"<<endl;
cin>>pub;
cout<<"Enter the number of pages:"<<endl;
cin>>pages;
cout<<"Enter number of books to be purchased:"<<endl;
cin>>no;
}
int return_book()
{
return(no);
}
void book_dis()
{
cout<<"The Author:"<<author<<endl;
cout<<"The Publication:"<<pub<<endl;
cout<<"The Pages:"<<pages<<endl;
cout<<"The no of books purchased:"<<no<<endl;
}
};
class cd:public item
{
protected: char category[20];
int item,speed,time,num;
public: void cd_info()
{
cout<<"Enter the category:"<<endl;
cin>>category;
cout<<"Enter the speed:"<<endl;
cin>>speed;
cout<<"Enter the time taken:"<<endl;
cin>>time;
cout<<"Enter the number of CD's to be ordered:"<<endl;
cin>>num;
}
int return_cd()
{
return(num);
}
void cd_dis()
{
cout<<"The category:"<<category<<endl;
cout<<"The time:"<<time<<endl;
cout<<"The speed:"<<speed<<endl;
cout<<"Number of CD's purchased:"<<num<<endl;
}
};

void main()
{
clrscr();
book b[20];
cd c[30];
int ch,ci,p,n=0,m=0;
do
{
cout<<"\n Main Menu\n";
cout<<"\n1.Book\n2.CD \n3.Display\n";
cout<<"Enter your choice(1,2,3):"<<endl;
cin>>ch;
switch(ch)
{
case 1:
int bk;
do
{
b[m].getdata();
b[m].book_info();
m++;
cout<<"Do you wish to continue book information ?(1/0)"<<endl;
cin>>bk;
}
while(bk==1);
break;
case 2:
int cs;
do
{
c[n].getdata();
c[n].cd_info();
n++;
cout<<"Do you wish to continue CD information ?(1/0)"<<endl;
cin>>cs;
}
while(cs==1);
break;

case 3:
int total_numbook=0,total_numcd=0;
for(p=0;p<m;p++)
{
cout<<"\n Book Information \n";
b[p].display();
b[p].book_dis();
total_numbook+=b[p].return_book();
}
cout<<"Total number of books ordered:"<<total_numbook<<endl;
for(p=0;p<n;p++)
{
cout<<"\n CD information \n";
c[p].display();
c[p].cd_dis();
total_numcd+=c[p].return_cd();
}
cout<<"Total number of CD's purchased:"<<total_numcd<<endl;
cout<<"\n Total number of items purchased:"<<total_numbook+total_numcd<<endl;
break;
default:
cout<<"Wrong choice !"<<endl;
}
cout<<"Do you wish to continue in the Main Menu ? (1/0)"<<endl;
cin>>ci;
}
while(ci==1);
getch();
}

















