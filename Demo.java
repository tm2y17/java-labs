package lab6AndLab8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/**
 * one class can only extend one abstract class, 
 * while this class can implement many interfaces;
 * 
 * Abstract classes can have constants, members, method stubs and defined methods, 
 * whereas interfaces can only have constants and methods stubs.
 * @author tm2y17
 *
 */
public class Demo {
	public static void main(String[] args) {
		Animal wolf=new Wolf("wolf1", 2);
		Animal sheep=new Sheep("sheep1", 3);
		Animal parrot=new Parrot("parrot1", 5);
		Animal polly=new Parrot(4);
		ArrayList<Animal> list=new ArrayList<>();
		list.add(wolf);
		list.add(sheep);
		list.add(parrot);
		list.add(polly);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+" :"+list.get(i).getAge());
		}
		Collections.sort(list);
		System.out.println("***************************");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getName()+" :"+list.get(i).getAge());
		}
		
		
	}
}
