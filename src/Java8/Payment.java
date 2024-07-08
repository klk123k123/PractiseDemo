package Java8;

public interface Payment { 
	public void doTransaction();
	default void addCoupon() {//no need to call in all methods
		System.out.println("You Got Five Rupees");
	}
	
	static void TransactionReport()//common for all classes
	{
		System.out.println("You Got Report");
		
	}
	

}
