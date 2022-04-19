package stringFunctions;

public class A17_DupliucateCharacters {

	public static void main(String[] args) {

		String a = "Sharmila Balasundaram";
		int count;

		char[] b = a.toCharArray();

		System.out.println("Duplicate characters of a String:");

		for (int i = 0; i < b.length; i++) {
			count = 1;
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] == b[j] && b[i] != ' ') {
					count++;
					b[j] = '0';
				}

			}
			if (count > 1 && b[i] != '0') {
				System.out.println(b[i]);

			}
		}

	}

}
