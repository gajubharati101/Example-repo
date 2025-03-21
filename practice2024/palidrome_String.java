package practice2024;

public class palidrome_String {

	public static void main(String[] args) {
		String s= "hint";
		String rev ="";

		for (int i=s.length()-1;i>=0;i--) {


			rev= rev+s.charAt(i);
		}
		if(s.equals(rev)) {

			System.out.println("this is palidrome number or string");
		}else {	
			System.out.println("this is not palidrome number or string");
		}

	}}
