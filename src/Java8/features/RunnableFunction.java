package Java8.features;

public class RunnableFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//it is thread
		Runnable run=()->
		{
			//System.out.println("Thread is Running");
			for(int i=1;i<=10;i++)
				System.out.println(i+" * "+"10 = "+(i*10));
			
		};
		Thread th=new Thread(run);
		th.start();
		th.sleep(500000);
		
		
	}

}
