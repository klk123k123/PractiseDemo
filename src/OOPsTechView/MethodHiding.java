package OOPsTechView;
class Parent
{
	public static void setPar() {
		System.out.println("Parent class");
	}
	private int testl;
}
class Child extends Parent
{
	//@Override//no way to override
	/*public static void setPar() {
		System.out.println("Child  class");
	}*/
	
	public static void setPar() {//method hiding
		System.out.println("Child  class");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new Child();
ch.setPar();
//ch.test1//cant access private variables
	}

}
