package lab6AndLab8;

public class Parrot extends Omnivore {

	public Parrot(String name, int age) {
		super(name, age);
	}
	
	public Parrot(int age) {
		this("Polly", age);
	}
	
//	make noise method;
	public void makeNoise() {
		System.out.println("ghhhhh--(Parrot)");
	}

}
