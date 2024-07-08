package Java8.features.PredefinedFunction;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierLambda {
	public static void main(String[] args) {
		//give the information to client
		Supplier<LocalDateTime> sup=()-> { return LocalDateTime.now();
	};
	System.out.println(sup.get());
	}

}
