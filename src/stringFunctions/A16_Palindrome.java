package stringFunctions;

public class A16_Palindrome {
	
	public static void main(String[] args) {
		
		String s1="2002", s2="";
		
		for (int i=s1.length()-1;i>=0;i--){
			s2=s2+s1.charAt(i);
		}
		
		//s1=s1.toLowerCase();
		//s2=s2.toLowerCase();
		
		if (s1.equals(s2)){
			System.out.println(s1+" is a palindrome");
		}
		else {
			System.out.println(s1+" is not a palindrome");
		}
	}
}
