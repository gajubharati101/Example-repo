package practice2024;

import java.util.Scanner;

public class odd_even_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER any values/ numbers = ");
		int n=sc.nextInt();
		
		if(n%2==0) {
			
			System.out.println("The given number is even number");
		}else {
			
			System.out.println("The given number is odd number");
		}
	}

}
