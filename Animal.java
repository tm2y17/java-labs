package lab6AndLab8;

public abstract class Animal implements Comparable<Animal> {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Animal() {
		this("newborn",0);
	}
	
//	getters
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	abstract void makeNoise();
	abstract void eat(Food food) throws Exception;
	
	public void eat(Food food, int times) throws Exception{
		if(this instanceof Carnivore) {
			if(food instanceof Plant) {
				throw new Exception("carnivore cannot eat plants");
			}
			else {
				for(int i=0;i<times;i++) {
					System.out.println(this.getName()+"+"+" is eating "+food.getName());
					System.out.println((i+1)+"+"+"times");
					System.out.println();
				}
			}
		}
		else if(this instanceof Herbivore) {
			if(food instanceof Meat) {
				throw new Exception("herbivore cannot eat meat");
			}
			else {
				for(int i=0;i<times;i++) {
					System.out.println(this.getName()+"+"+" is eating "+food.getName());
					System.out.println((i+1)+"+"+"times");
					System.out.println();
				}
			}
		}
		else {
			for(int i=0;i<times;i++) {
				System.out.println(this.getName()+"+"+" is eating "+food.getName());
				System.out.println((i+1)+"+"+"times");
				System.out.println();
			}
		}
	}
	
	public int compareTo(Animal other) {
		return Integer.compare(this.getAge(), other.getAge());
	}
}
