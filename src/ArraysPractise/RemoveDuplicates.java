package ArraysPractise;

import java.util.Scanner;

class Remove
{
	void setRemoved(int n,int arr[])
	{
		System.out.println("Remove Duplicates : ");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					//arr[j]=arr[i+1];
					break;
				}
			}
			System.out.println(arr[i]);
		}
			/*for(int i=0;i<n;i++)
			{
				
			System.out.println(arr[i]);
		}*/
	}
}
public class RemoveDuplicates {

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
		Remove r=new Remove();
		r.setRemoved(n, arr);
	}

}
