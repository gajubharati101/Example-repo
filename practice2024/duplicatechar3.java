package practice2024;

public class duplicatechar3 {

	public static void main(String[] args) {
	
		String s= "vijaygaju";
		
		int length =s.length();
		
		char ch[]= s.toCharArray();
		
		for(int i=0;i<length;i++) {
			
			for(int j=i+1;j<length;j++) {
				
				
				if (ch[i]==ch[j]) {
					
					System.out.println("duplicate charctor is = "+ch[j]);
				}
			}
		}

	}

}
