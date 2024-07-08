package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StudentComparabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Student> list=new ArrayList<>();
list.add(new Student("Lakshmi", "Pollai", 111));
list.add(new Student("Lakshman", "Timmala", 117));
list.add(new Student("Hanvika", "pillai", 101));
list.add(new Student("Jyothi", "Jamuri", 201));
list.add(new Student("Pandu", "Jabilli", 123));
//Collections.sort(list,new StudentcomparatorbyBatchNumber());
Collections.sort(list,new Comparator<Student>()
		{

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getFirstName().compareTo(s2.getFirstName());
			}
	
		});	
Iterator it=list.iterator();
while(it.hasNext())
System.out.println(it.next());

	}

}
