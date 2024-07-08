package PracticeInterview.com;

import java.util.Scanner;

class Deleting {

	void isDelete(int arr[], int n, int del) {
		int arr1[] = new int[n - 1];
		for (int i = 0; i < n; i++) {
			if (i < del)

				arr1[i] = arr[i];

			else
				arr1[i - 1] = arr[i];
		}
		System.out.println("Final Array : ");
		for (int arr2 : arr1)
			System.out.println(arr2+" ");

	}

}
class Adding extends Deleting {

	void isAdd(int arr[], int n, int del,int newel) {
		int arr1[] = new int[n+1];
		for (int i = 0; i < n; i++) {
			if (i < del)
				arr1[i] = arr[i];
			else if(i==del)
				arr[i]=newel;
			else
				arr1[i] = arr[i-1];
		}
		System.out.println("Final Array : ");
		for (int arr2 : arr1)
			System.out.print(arr2+" ");

	}

}

public class DeletingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Array Size: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Please Enter Array Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Please Enter deleteElement: ");
		int del = sc.nextInt();
		System.out.println("Please Enter AddingElement: ");
		int newel = sc.nextInt();
		//Deleting d = new Deleting();
		Adding a=new Adding();
		a.isDelete(arr, n, del);
		a.isAdd(arr,n,del,newel);
	}
}
