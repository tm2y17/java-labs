package lab6AndLab8;

public class Carnivore extends Animal {

	public Carnivore(String name, int age) {
		super(name, age);
	}
	
	public Carnivore() {
		super();
	}
	
	@Override
	void makeNoise() {
		
	}

	@Override
	void eat(Food food) throws Exception {
		if(food instanceof Plant) {
			throw new Exception("this kind of animals cannot eat plant");
		}
		else
		System.out.println(this.getName()+" is eating "+food.getName());
	}



}
