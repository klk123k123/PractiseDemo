package Java8.features.DAO;

import java.util.ArrayList;
import java.util.List;

import Java8.features.Entity.Student;

public class SortingControler {

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList<>();
		list.add(new Student(101,"LAkshmi","Lakshmi@gmail.com"));
		list.add(new Student(195,"LAkshmian","Lakshman@gmail.com"));
		list.add(new Student(10,"Hanvika","Hanvika@gmail.com"));
		list.add(new Student(190,"Rithik","Rithick@gmail.com"));
		list.add(new Student(131,"Pournami","Pournami@gmail.com"));
		return list;
	}
	

}
