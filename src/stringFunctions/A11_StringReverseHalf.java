package stringFunctions;

public class A11_StringReverseHalf {
	
	public static void main(String[] args) {
		
	
	String a="Hari Priya";
	System.out.println(a.indexOf('i'));
	String b= a.substring(0,4);
	
	for (int i=b.length()-1;i>=0;i--){
		System.out.print(b.charAt(i));
		
	}
	}
}
