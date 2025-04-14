package Array;


public class Arraylist {

	public static void main(String[] args) {
			
		int num[]= {11,23,45,67,78,89};
		
		int min=num[0];
		
		for(int i=0;i<6;i++) {
			if(num[i]<min) {
				
			min=num[i];
			}
		}
		System.out.println("Minimum number is:--"+min);
	}

}
