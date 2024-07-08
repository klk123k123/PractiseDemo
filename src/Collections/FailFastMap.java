package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Map<Integer,String> map=new HashMap<>();
		Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();//there is no clone method so we get three value.
map.put(1, "Lakshmi");
map.put(2, "Lakshman");
Iterator it=map.keySet().iterator();
while(it.hasNext()) {
	Integer key=(int)it.next();
	System.out.println(key+" : "+map.get(key));
	map.put(3, "Hanvika");
}



	}

}
