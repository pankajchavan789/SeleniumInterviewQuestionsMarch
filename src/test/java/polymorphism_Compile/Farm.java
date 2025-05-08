package polymorphism_Compile;

public class Farm {
	
	
	public void grips() {
		System.out.println("This is grips farm");
	}
	
	public void grips(String name) {
		System.out.println(name);
	}
	public void grips(int years) {
		System.out.println(years);
	}

	public static void main(String[] args) {
		Farm f=new Farm();
		f.grips();
		f.grips("SONAKA");
		f.grips(2022);

	}

}
