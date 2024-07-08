package ExceptionPractise;

import java.util.ArrayList;
import java.util.Scanner;

class NameException extends Exception
{
	NameException(String msg)
	{
		super(msg);
	}
}
class Employee
{
	//ArrayList<String> list=new ArrayList<>();
	void setName(String name,@SuppressWarnings("rawtypes") ArrayList list) throws NameException
	{
		if(list.contains(name))
			throw new NameException("Your Name is Not in List");
		else
			System.out.println("Congratulations! Your Name Is In  List");
	}
}
public class ContainName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("List Names : ");
ArrayList<String> list=new ArrayList<>();
list.add(sc.nextLine());
list.add(sc.nextLine());
list.add(sc.nextLine());
list.add(sc.nextLine());
list.add(sc.nextLine());
list.add(sc.nextLine());
System.out.println("Please Enter Your Name");
String name=sc.nextLine();
Employee e=new Employee();
try {
	e.setName(name, list);
} catch (NameException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}


	}

}
