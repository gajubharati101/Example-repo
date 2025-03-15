import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int no=s.nextInt();
		
		System.out.println("Enter the number: ");

int temp=0;

for(int i=2;i<=no-1;i++) {
	if(no%i==0) {
			temp=temp+1;
			
	}
	if(temp==0) {
		System.out.println(no+"no is prime_number");

	}
	else {
		System.out.println(no+"no is not prime_number");

	}

}
	}

}
