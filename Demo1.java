
public class Demo1 {

	public static void main(String[] args) {
		
		StringBuilder b1=new StringBuilder("core");
		System.out.println(b1);
		
		b1.append("Java");
		System.out.println(b1);
		
		b1.reverse();
		System.out.println(b1);
		
		StringBuffer b2=new StringBuffer();
		b2.append("Samba Dinga Bunga");
		System.out.println(b2);
		
		b2.replace(6, 11,"DINGA");
		System.out.println(b2);
		
		
		
		
		
	}
}
