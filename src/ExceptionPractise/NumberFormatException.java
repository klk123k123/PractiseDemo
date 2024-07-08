package ExceptionPractise;

import java.util.Scanner;

public class NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Name : ");
		String name=sc.nextLine();
		try
		{
			int n=Integer.parseInt(name);
			System.out.println("Value Is: "+n);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Numbers HAHAHAHA");
		}

	}

}
