package TestingReverse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		String[] color= {"Blue","White","Red","Blue","Red","Yellow"};
		
		for(int i=0;i<color.length;i++) {
			
			for(int j=i+1;j<color.length;j++) {
			
		
			if(color[i].equals(color[j])) {
				System.out.print(color[i]+" ");
				break;
				
			}
			}
		}

	}

}
