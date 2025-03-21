package practice2024;

public class min_number {

	public static void main(String[] args) {
		
		int a[]={100,223,30,500,5,97};
		int len= a.length;
		
		
		int min=a[0];
		for (int i=0;i<len;i++) {
			
			if(min>a[i]) {
				
			min=a[i];
			
						}
				
		}
		System.out.println("the minimum number is : "+min);
	}

}
