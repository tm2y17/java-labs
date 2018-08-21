package lab6AndLab8;

public class Herbivore extends Animal{

	public Herbivore(String name, int age) {
		super(name, age);
	}

	@Override
	void makeNoise() {
		
	}

	@Override
	void eat(Food food) throws Exception {
		if(food instanceof Meat) {
			throw new Exception("this kind of animals cannot eat Meat");
		}
		else {
			System.out.println(this.getName()+" is eating "+food.getName());
		}
	}


}
