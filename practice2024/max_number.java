package practice2024;

public class max_number{

	public static void main(String[] args) {
		int a[]={100,223,3000,500,5,97};
		int length= a.length;
		int max=a[0];

		for(int i=0;i<length;i++) {
			if(max<a[i]) {

				max=a[i];
			}
		}
		System.out.println("The maximum number is : "+max);
	}

}


