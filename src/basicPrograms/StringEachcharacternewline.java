package basicPrograms;

public class StringEachcharacternewline {

	public static void main(String[] args) {
		
		//Print the each character of string in new line
		
		String str="Sangram";
		int len=str.length();
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			System.out.println(ch);
		}
	}

}
