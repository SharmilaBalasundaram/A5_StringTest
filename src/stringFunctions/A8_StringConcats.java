package stringFunctions;

public class A8_StringConcats {

	public static void main(String[] args) {

		String a = new String("  Sharmila ");
		String b = "Techie";

		System.out.println(a + b); // it performs on string literal case
		System.out.println(a.concat(b));
	}

}
