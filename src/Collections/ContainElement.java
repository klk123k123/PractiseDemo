package Collections;

import java.util.ArrayList;
import java.util.Scanner;

class Contain
{
	void setName(String s,ArrayList<String> array)
	{
		if(array.contains(s))
			System.out.println("Your Name is in the list");
		else
			System.out.println("Your Name is not in the list");
	}
}
public class ContainElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Names : ");
		ArrayList<String> array=new ArrayList<>();
		for(int i=0;i<5;i++)
			array.add(sc.nextLine());
		System.out.println("Please enter Your Searchng Name: ");
		String name=sc.nextLine();
		Contain c=new Contain();
		c.setName(name,array);
		
			
	}

}
