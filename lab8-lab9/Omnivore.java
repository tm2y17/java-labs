package lab6AndLab8;

public class Omnivore extends Animal{

	public Omnivore(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void makeNoise() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat(Food food) {
		System.out.println(this.getName()+" is eating "+food.getName());
	}


}
