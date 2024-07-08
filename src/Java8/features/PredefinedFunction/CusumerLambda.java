package Java8.features.PredefinedFunction;

import java.util.function.Consumer;

public class CusumerLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//take input but no result
Consumer<String> cons=(input) -> System.out.println(input);
cons.accept("Lakshmi");
	}

}
