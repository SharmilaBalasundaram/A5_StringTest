package stringFunctions;

public class A14_StringSwapwithoutTemp {

	public static void main(String[] args) {
		
		String a="Sharmila";
		String b="Balasundaram";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

		
		
		
	}
	
}
