package Inheritance;

public class multilevel extends pankaj {
	
	public void cycle() {
		System.out.println("Titan brand is Cycle");
	}

	public static void main(String[] args) {
		multilevel m=new multilevel();
		m.bikes();
		m.cars();
		m.cycle();

	}

}
