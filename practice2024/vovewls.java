package practice2024;

import java.util.Scanner;

public class vovewls {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the charactor : ");
		
		char ch =sc.next().charAt(0);
		
		if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u') {
			
			System.out.println("vovels charactor ");
		}else {
			System.out.println("consont charactor ");
			
		}

	}

}
