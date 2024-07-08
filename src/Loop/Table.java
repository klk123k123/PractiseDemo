package Loop;

import java.util.Scanner;

class TableFormat
{
	//int num;
	void printTable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number : ");
int num=sc.nextInt();
TableFormat t1=new TableFormat();
t1.printTable(num);
	}

}
