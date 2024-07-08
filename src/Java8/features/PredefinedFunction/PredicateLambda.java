package Java8.features.PredefinedFunction;

import java.util.function.Predicate;

public class PredicateLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tre or false
Predicate<String> pre=(input) ->  input.contains("laks");
System.out.println(pre.test("lakshmi"));
	}

}
