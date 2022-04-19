package stringFunctions;

public class A18_StringSplit {

	public static void main(String[] args) {
		
		String s="java,selenium,maven,testng,cucumber,github";
		
		String [] data=s.split(",");
		
		for (int i=0;i<data.length;i++){
			System.out.println(data[i]);
		}
		
		
		
	}
}
