package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//public class Comparabletq implements Comparable{
public class Comparabletq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Student> com=(Student i,Student j)-> {return i.getBatchNumber()>j.getBatchNumber()?1:-1;};
	List<Student> value=new ArrayList();
		value.add(new Student("Lakshmi","Pollai",101));
		value.add(new Student("Lakshman","Pollai",111));
		value.add(new Student("Lakshman","Timmala",121));
		value.add(new Student("Hanvika","pogarula",154));
		value.add(new Student("Teja","JUTTU",101));
		value.add(new Student("Lakshmi","Pollai",101));
		value.add(new Student("Lakshman","Timmala",121));
	
	Collections.sort(value,com);
Iterator it=value.iterator();
while(it.hasNext())
	System.out.println(it.next());
		
	}


}
