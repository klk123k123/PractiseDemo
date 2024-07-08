package ExceptionPractise;

import java.util.Scanner;

class AgeException extends Exception
{
	AgeException (String msg)
	{
		super(msg);
	}
}
class Voter 
{
	void setAge(int age) throws AgeException
	{
		if(age<18||age>60)
		throw new AgeException("Your Age  Is Not Elegible For Voting ");
		else
			System.out.println("Your Age Is Eligible For Voting");
	}
}
public class UserdefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int n=sc.nextInt();
		Voter v=new Voter();
		try {
			v.setAge(n);
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
