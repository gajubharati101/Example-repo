package practice2024;

public class duplicate_char {

	public static void main(String[] args) {
		
		String s = "abcdvijaydy";
		
		int lenght = s.length();
		
		char ch[]= s.toCharArray();
		
		for(int i=0;i<lenght;i++) {
				for(int j=i+1;j<lenght;j++) {
					
					if (ch[i]==ch[j]) {
					
						System.out.println("The Duplicate charactor is = "+ch[j]);
					}
				}
		}
		

	}

}
