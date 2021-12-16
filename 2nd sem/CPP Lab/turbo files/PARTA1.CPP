#include<iostream.h>
#include<conio.h>
#define PI 3.14
class POLYMORPH
{
public:
static float volume(float rad)  //sphere
{ return 4*PI*rad*rad*rad/3;}
static float volume(float rad,float height)   //cylinder
{ return PI*rad*rad*height;}
static float volume(float length,float breadth,float height)  //rectangular prism
{ return length*breadth*height;}
};
int main()
{
float rad,length,breadth,height;
clrscr();
cout<<"Enter radius of sphere : ";
cin>>rad;
cout<<"volume of sphere with radius "<<rad<<" is "<<POLYMORPH::volume(rad)<<"\n";
cout<<"Enter radius and height of cylinder : ";
cin>>rad>>height;
cout<<"volume of a cylinder with radius "<<rad<<" and height "<<height<<" is "<<POLYMORPH::volume(rad,height)<<"\n";
cout<<"Enter the length,breadth and height of rectangular prism : ";
cin>>length>>breadth>>height;
cout<<"volume of a rectangular prism with length "<<length<< " breadth "<<breadth<<" and height "<<height<<" is : "<<POLYMORPH::volume(length,breadth,height)<<"\n";

getch();
return 0;
}
/*
Enter radius of sphere : 4
volume of sphere with radius 4 is 267.946655
Enter radius and height of cylinder : 4 6
volume of a cylinder with radius 4 and height 6 is 301.440002
Enter the length,breadth and height of rectangular prism : 6 7 8
volume of a rectangular prism with length 6 breadth 7 and height 8 is : 336
*/