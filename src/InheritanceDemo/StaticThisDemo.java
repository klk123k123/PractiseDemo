package InheritanceDemo;
class Test
{
	static int i=10;
	 void test()
	{
		System.out.println(this.i);
	}
}
public class StaticThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test s=new Test();
s.test();
	}

}
