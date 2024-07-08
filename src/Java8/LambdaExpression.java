package Java8;
@FunctionalInterface
interface Product
{
	//abstract void call();//we can call only one abstract method in functional interface.
//abstract void Print(int num);
int print(int i1,int i2);	
}
public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product p=( ) -> {System.out.println("Calling");};
//p.call();
	//	Product p=(num) -> {System.out.println("Calling : "+num);//without creating subclass directly we cN Call override method
	//};
		Product product= 
				(i1,i2) -> {
		if(i2<i1)
			throw new RuntimeException("Message");
		else 
			return i2-i1 ; 
		} ;
					 ;
	System.out.println(product.print(234,37));

}
}