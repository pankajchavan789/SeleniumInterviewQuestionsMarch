package Array;

import java.util.Arrays;

public class findnumber {

	public static void main(String[] args) {
		
		int[][] num={{10,11},
				     {54,76}};
		
		for(int row=0;row<num.length;row++) {
			for(int col=0;col<num[row].length;col++) {
				
				System.out.print(num[row][col]+" ");
			}
			
			System.out.println();
		}
			
		

	}

}
