package Java8.features.Predefinedfun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("unlikely-arg-type")
List<StudentModel> list=new ArrayList();
list.add(new StudentModel(1,"Lakshmi","Pollai"));
list.add(new StudentModel(2,"Lakshman","Timmala"));
list.add(new StudentModel(3,"Hanvika","Jk"));
list.add(new StudentModel(4,"Kj","klj"));
list.add(new StudentModel(5,"jkl","kljhgf"));
list.add(new StudentModel(10,"lk","kl"));
//Predicate<StudentModel> pre = (input) -> list.equals("Lakshmi");
list.forEach(input -> { System.out.println( input.getFirstName().toUpperCase()); });
//System.out.println(pre.test((StudentModel) list));

	}

}
