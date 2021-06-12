
public class Sample1 {
public static void main(String[] args) {
	
//without instantiation
	String s1="Pune";
	String s2="Pune";
	
//with instantiation
	String s3=new String("Pune");
	String s4=new String("pune");
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	System.out.println();
	System.out.println("to comapre object address");
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
	System.out.println(s3==s4);
	
	System.out.println();
	System.out.println("to comapre object content");
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s1.equals(s4));
	System.out.println(s3.equals(s4));
}
}
