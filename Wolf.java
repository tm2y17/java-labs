package lab6AndLab8;

public class Wolf extends Carnivore{

	public Wolf(String name, int age) {
		super(name, age);
	}
	
	public Wolf() {
		super();
	}
	
//	make noise method;
	public void makeNoise() {
		System.out.println("hhhhhh--(wolf)");
	}

}
