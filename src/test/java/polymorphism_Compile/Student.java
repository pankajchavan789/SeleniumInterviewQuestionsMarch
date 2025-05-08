package polymorphism_Compile;

public class Student {
	
	public void play() {
		System.out.println("Playing in Ground");
	}
	public void play(String cricket) {
		System.out.println("Playing Cricket");
	}
	public void play(String carrom,int overs) {
		System.out.println("Playing carrom");
	}

	public static void main(String[] args) {
		Student s=new Student();
		s.play();
		s.play("IPL");
		s.play("International", 2);

	}

}
