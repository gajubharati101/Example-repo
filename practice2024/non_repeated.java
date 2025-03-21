package practice2024;

public class non_repeated {

	public static void main(String[] args) {
	
		String s= "sssssssssssssaaaaaaaaaaagmmmmmmmmmvvvvvvvvvvvuuuuuuuuuux";
		
		char ch[]=s.toCharArray();
		
		for(char c:ch) {
			
			if(s.indexOf(c)==s.lastIndexOf(c)) {
				
				System.out.println("Non repeated charctor is = "+c);
			}
		}
		
		
		}
	}

