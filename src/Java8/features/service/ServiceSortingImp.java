package Java8.features.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import Java8.features.DAO.SortingControler;
import Java8.features.Entity.Student;

public class ServiceSortingImp implements ServiceSorting {

	@Override
	public List<Student> getStudentByOrder() {
		// TODO Auto-generated method stub
		List<Student> list=new SortingControler().getStudents();
		//Collections.sort(list, (o1,o2)-> o1.getName().compareTo(o2.getName())) ;
		Collections.sort(list,(o1, o2)-> {
			if(o1.getId()>= o2.getId()) 
				return 1;
			else
				return -1;
		});
		
		return list;
	}

}
