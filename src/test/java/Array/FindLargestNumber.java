package Array;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int a[]= {8,3,9,7};
		
		int min = 0;
		for(int i=0;i<a.length;i++)
			if(min>a[i])
				min=a[i];
		
		{
			System.out.println(min);
		}

	}

}
