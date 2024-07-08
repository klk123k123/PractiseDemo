package StringCoding;

public class MutableImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("Java");
//String s="Techie"; //we cant add (immutable)
s.concat("Techie");
System.out.println(s);

StringBuffer sb=new StringBuffer("Core");//mutable
sb.append("java");
System.out.println(sb);
StringBuilder sb1=new StringBuilder("Hiberanate");//mutable
sb1.append("java");
System.out.println(sb1);
	}

}
