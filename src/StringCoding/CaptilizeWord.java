package StringCoding;

import java.util.Scanner;

class StringFormat
{
	static String isCapitalWord(String str)
	{
		String[] word=str.split("\\s");
		String finalWord="";
		for(String w:word)
		{
		String firstChar=w.substring(0,1);
		String afterChar=w.substring(1);
		finalWord+=firstChar.toUpperCase()+afterChar+" ";
		
	}
		return finalWord.trim();
}
}
public class CaptilizeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter your Sentence");
String name=sc.nextLine();
System.out.println(StringFormat.isCapitalWord(name));
	}

}
