package ArraysPractise;

import java.util.Scanner;

public class RemoveSpecificIndex {

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
		System.out.println("Elements Are : ");
		for(int i=0;i<n;i++)
		{
		System.out.print(arr[i]+" ");
		}
System.out.println("Enter Specific Index :");
int spe=sc.nextInt();
for(int i=0;i<n;i++)
{
	if(spe==i)
	{
		continue;
	}
	System.out.println(arr[i]);
}
	}

}
