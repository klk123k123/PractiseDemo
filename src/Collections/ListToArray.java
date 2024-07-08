package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> sl = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Name : ");
		for (int i = 0; i < 5; i++) {
			sl.add(sc.nextLine());
		}
		String[] name = new String[5];
		for (int i = 0; i < 5; i++)
			name[i] = sl.get(i);
		System.out.println("Names Are : " );
		for (String str : name)
			System.out.println(str);
	}
}
