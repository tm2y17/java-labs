package lab6AndLab8;

public class Main {

	public static void main(String[] args) throws Exception {
		Animal wolf=new Wolf("li", 2);
		Animal sheep=new Sheep("Toby",3);
		Animal parrot=new Parrot("bob",4);

		Food meat=new Meat("beef");
		Food cabbage=new Plant("cabbage");
		
//		wolf.eat(meat);
//		parrot.eat(cabbage);
//		wolf.eat(cabbage);
//		sheep.eat(meat);
//		wolf.eat(meat, 3);
		Animal newOne=new Wolf();
		System.out.println(newOne.getName()+"+"+newOne.getAge());
		
	}
}
