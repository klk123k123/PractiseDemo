package ArraysPractise;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Array Size : ");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("Enter the elements");
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Reversed Array :");
for(int i=(n-1);i>=0;i--)
{
	System.out.println(arr[i]);
}
	

}
}
