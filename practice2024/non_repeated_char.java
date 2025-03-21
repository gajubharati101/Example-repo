package practice2024;

public class non_repeated_char {

	public static void main(String[] args) {
		
		String s= "aayabbbbbbbbbdcdeeeeee";
		
		char ch[]=s.toCharArray();
		for(char c:ch) {
			
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				
				System.out.println("first non repeated char "+c);
			}
		}
		
	}

}
