package practice2024;

public class min_max_Array {

	public static void main(String[] args) {
		int a[]= {10,20,30,80,5,97};
		int length =a.length;

		int min=a[0];
		int max=a[0];

		for(int i=0;i<length;i++) {

			if(min>a[i]) {

				min=a[i];

			}
		}
		System.out.println("The Minimum number in arraylist is : "+min);

		for (int i=0;i<length;i++) {

			if(max<a[i]) {

				max= a[i];

			}
		}
		System.out.println("The maximum number is : "+max);
	}

}
