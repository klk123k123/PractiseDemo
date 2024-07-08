package ArraysPractise;

import java.util.Scanner;

class Maximum
{
	int max;
	void setMax(int n,int arr[])
	{
		for(int i=0;i<n;i++)
		{
			max=arr[0];
			if(max<arr[i])
			{
				max=arr[i];
				//System.out.println("Biggest Number : "+max);
				//break;
				//return max;
			}
		}
		System.out.println("Biggest Number : "+max);
	}
}
class Minimum extends Maximum
{
	int min;
	void setMin(int n,int arr[])
	{
		for(int i=0;i<n;i++)
		{
			min=arr[0];
			if(min>arr[i])
			{
				//System.out.println("Smallest Number : "+min);
				//break;
				//return min;
				min=arr[i];
			}
		}
		System.out.println("Smallest Number : "+min);
	}
}
public class Maxandmin {

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
Minimum m=new Minimum();
m.setMax(n, arr);
m.setMin(n, arr);
	}

}
