package StringCoding;

import java.util.Scanner;

class SecondCapitilize
{
	static String isSecondCapital(String str)
	{
		String[] word=str.split("\\s");
		System.out.println(" sentense length : "+word.length);
		String finalWord="";
		for(String w:word)
		{
			String firstLetter=w.substring(0,1);
			String secondRemain=w.substring(1);
			finalWord+=firstLetter+secondRemain.toUpperCase()+" ";
		}
		return finalWord.trim();
	}
}
public class RemainingCaptialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter your Sentence");
		String name=sc.nextLine();
		System.out.println(SecondCapitilize.isSecondCapital(name));
	}

}
