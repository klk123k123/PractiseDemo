package Collections;

import java.util.ArrayList;

public class ArrayListNotAllowdDupli extends ArrayList {
	public boolean add(Object o)
	{
		if(this.contains(o))
			return true;
		else 
			return super.add(o);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListNotAllowdDupli list=new ArrayListNotAllowdDupli();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add("Hanvika");
		list.add("Hanvika");
		System.out.println(list);
		
	}

}
