package InterfaceJava;

public class passion {

	public static void main(String[] args) {
		
		int num[]= {53,72,43,21};
		
		int min=num[0];
		
		for(int i=0;i<4;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		System.out.println(min);
		
		
	
}
}
