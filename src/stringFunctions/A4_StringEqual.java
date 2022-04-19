package stringFunctions;

public class A4_StringEqual {

	public static void main(String[] args) {
		
		String a = "  Sharmila   ";
		String b = "  Sharmila   ";
		
		System.out.println(a.equals(b)); // returns boolean
		System.out.println(a.equalsIgnoreCase(b)); // returns boolean
		System.out.println(a.compareTo(b));
		
	}
}
