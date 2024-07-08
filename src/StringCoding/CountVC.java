package StringCoding;

import java.util.Scanner;

public class CountVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Please Enter String : ");
String name=sc.nextLine();
char[] ch= {'a','e','i','o','u','A','E','I','O','U'};
int vow=0,cons=0;
for(int i=0;i<name.length();i++)
{
	//for(int j=0;j<ch.length;j++)
	//{
///
 if(name.charAt(i)=='a' ||
name.charAt(i)=='e' ||
name.charAt(i)=='i' ||
name.charAt(i)=='o' ||
name.charAt(i)=='u' ||
name.charAt(i)=='A' ||
name.charAt(i)=='E' ||
name.charAt(i)=='I' ||
name.charAt(i)=='O' ||
name.charAt(i)=='U' 
)
//*/
		//if(name.charAt(i)==ch[j])

vow++;
		//break;
	
		else
	cons++;
//}
}	
System.out.println("Count the vowels are : "+vow);
System.out.println("Count the Consonants are : "+cons);
	}
	}
	

