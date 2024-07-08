package ArraysPractise;

import java.util.Scanner;

class Ascending
{
	void setAscend(int n,int arr[])
	{
		int asen=0;
		System.out.println("Ascending order : ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					//System.out.print(arr[i]);
					asen=arr[i];
					arr[i]=arr[j];
					arr[j]=asen;
					
				}
				//System.out.println(" ");
			}
		}
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}
class Dscending extends Ascending
{
	void setDscend(int n,int arr[])
	{
		int dsen=0;
		System.out.println("Dscending order : ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					//System.out.print(arr[i]);
					dsen=arr[i];
					arr[i]=arr[j];
					arr[j]=dsen;
					
				}
				//System.out.println(" ");
			}
		}
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}

public class AscendingOrder {

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
		System.out.println();
		Dscending as= new Dscending();
		as.setAscend(n, arr);
		System.out.println();
		as.setDscend(n, arr);
	}

}
