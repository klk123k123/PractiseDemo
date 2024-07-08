package Collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetNotAllowDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> value=new HashSet();
		value.add(new Student("Lakshmi","Pollai",101));
		value.add(new Student("Lakshman","Pollai",111));
		value.add(new Student("Lakshman","Timmala",121));
		value.add(new Student("Hanvika","pogarula",154));
		value.add(new Student("Teja","JUTTU",101));
		value.add(new Student("Lakshmi","Pollai",101));
		value.add(new Student("Lakshman","Timmala",121));
//Collections.sort(value);
		Iterator it=value.iterator();
		while(it.hasNext())
		{
			
		System.out.println(it.next());
		}

	}

}
