package stringFunctions;

public class A10_SubstringAndTrim {

	public static void main(String[] args) {

		String a = new String(" Banana");

		System.out.println(a.substring(1, 4));
		System.out.println(a.subSequence(1, 4));
		System.out.println(a.trim());		
		

	}

}
