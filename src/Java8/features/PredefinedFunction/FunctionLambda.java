package Java8.features.PredefinedFunction;

import java.nio.charset.CoderMalfunctionError;
import java.util.function.Function;

/*class FunctionImpl implements Function<String, Integer>
{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}*/
public class FunctionLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Function<String ,Integer> fun=new FunctionImpl();
		//System.out.println(fun.apply("Lakshmi"));
		//Using Lamda Expression
		Function<String,Integer> fun1=(input)-> input.length();
		System.out.println(fun1.apply("Lakshman"));
	}

}
