package practice2024;

import java.util.Scanner;

public class reversestring {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println(" enter any number or charctor :");
		
		String s=sc.next();
		String rev ="";
		
		for (int i=s.length()-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		 System.out.println("reverse string is : "+rev);
	
	}

}
