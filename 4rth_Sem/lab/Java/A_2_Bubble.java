import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_2_Bubble
{
static void bubbleSort(int arr[])
{
int n = arr.length;

int temp=0;
for (int i=0;i<n ;i++)
{
for (int j = 1;j<n; j++)
{
if(arr[j-1]>arr[j])
{
temp=arr[j-1];
arr[j-1]= arr[j];
arr[j]=temp;
}
} 
}
}

public static void main(String args[])
{
int arr[] = new int[args.length];
System.out.println("Entered array elements are");
for(int i=0; i<(args.length);i++)
{
arr[i]=Integer.valueOf(args[i]);
System.out.print(arr[i]+" ");
}

System.out.println("\n\nElements before sorting:");
for(int i=0; i<args.length;i++)
{
System.out.print(arr[i]+"\t");
}

bubbleSort(arr);

System.out.println("\nElements after bubble sort:");
// int[] narr = new int [10]; 
for(int i=0;i<arr.length; i++)
{ 
// if(arr[i]==0)
// { 
// continue;
// } 
// else
// { 
// narr[i]=arr[i];
// } 
System.out.print(arr[i]+"\t");
} 

}
}