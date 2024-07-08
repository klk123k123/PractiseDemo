package Collections;

import java.util.ArrayList;

class CustomerArrayList extends ArrayList
{
	public boolean add(Object o)
	{
		if(this.contains(o))
		return true;
		else
		return super.add(o);
		
	}
	
}
public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerArrayList list=new CustomerArrayList();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add("Lakshmi");
		list.add("Lakshmi");
		list.add("laxmi");
		System.out.println(list);
	}

}
