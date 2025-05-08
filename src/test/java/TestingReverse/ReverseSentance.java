package TestingReverse;

public class ReverseSentance {

	public static void main(String[] args) {
		
		String sentense="my name is pawan";
		
		String[] word=sentense.split(" ");
		
		for(int i=word.length-1;i>=0;i--) {
			
			System.out.print(word[i]+" ");
		}
		
		

	}

}
