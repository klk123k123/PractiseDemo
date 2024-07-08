package Fundmentals;
class Demo
{
	private final int val=20;
	public void setDemo()
	{
	try
	{
		int m=val/0;
		System.out.println(m+ " is  value");
	}
	catch(ArithmeticException e)
	{
	e.printStackTrace();
	}
	finally
	{
		System.out.println("Everything will go Fine");
	}
	}
	
	protected void finallize() throws Throwable 
	{
		System.out.println("Finallize will be done");
	}
}
public class Finallyize {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo d=new Demo();
d.setDemo();
//d=null;//if object is null finallize method will be print
System.gc();
	}

}
