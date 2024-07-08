package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Name : ");
		HashSet hashset=new HashSet<>();
		hashset.add("Lakshmi");
		hashset.add("Priya123");
		hashset.add(6286003);
		hashset.add(0.789f);
		hashset.add("Apple");
		Iterator it=hashset.iterator();
		System.out.println("HashSet Containse :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
