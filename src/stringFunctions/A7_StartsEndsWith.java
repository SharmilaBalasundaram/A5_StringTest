package stringFunctions;

public class A7_StartsEndsWith {

	public static void main(String[] args) {

		String a = new String("  Sharmila");

		System.out.println(a.startsWith("Sha")); // returns boolean
		System.out.println(a.endsWith("la")); // returns boolean
		System.out.println(a.startsWith("  Sha", 0));
	}

}
