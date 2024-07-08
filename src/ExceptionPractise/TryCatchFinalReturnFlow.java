package ExceptionPractise;

class Test
{
	public static int setReturn() {
		try
		{
			return 1;
		}
		catch(Exception e)
		{
		return 2;
		}
		finally//-----step 1
		{
		System.exit(0);//won't return value
			return 3;
		}
		
	}
}
public class TryCatchFinalReturnFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Test.setReturn());//return 3 step1 -- return 1
	}

}
