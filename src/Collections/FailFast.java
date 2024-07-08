package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
//fail fast which allow any modification iterator called fail fast and fail safe which will did middle of modification
public class FailFast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List<String> value=new ArrayList<>();
		List<String> value=new CopyOnWriteArrayList<String>();//it has clone method so we didn't get error but didn't that add value too
value.add("Lakshmi");
value.add("Lakshman");
Iterator it=value.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
value.add("Hanvika");
}
	}

}
