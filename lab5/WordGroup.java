package lab5;
/**
 * 3 parts contents are in main methods separately;
 */
import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {
	public String words;
	
	/**
	 * constructor(Stores lower case words into "words")
	 * @param S
	 */
	public WordGroup(String S) {
		words=S.toLowerCase();
	}
	
	/**
	 * split "words" by " " 
	 * @return parts
	 */
	public String[] getWordArray() {
		String parts[]= words.split(" ");
		return parts;
	}
	

	/**
	 * add two word array into hashsets;
	 * @param obj
	 * @return
	 */
	public HashSet<String> getWordSet(WordGroup obj){
		HashSet<String> hashset =new HashSet<String>();
		for (int i = 0; i <this.getWordArray().length; i++) {
			hashset.add(this.getWordArray()[i]);
		}
		for (int i = 0; i < obj.getWordArray().length; i++) {
			hashset.add(obj.getWordArray()[i]);
		}
		
		return hashset;
	}
	
	/**
	 * count the word number;
	 * and then put them into hashmap;
	 * @return hashmap<parts,times>
	 */
	public HashMap<String,Integer> getWordCounts() {
		HashMap<String,Integer> hashmap=new HashMap<String,Integer>();
		for (int i = 0; i < getWordArray().length; i++) {
			int count=0;
			if(hashmap.containsKey(getWordArray()[i])) {
				count=hashmap.get(getWordArray()[i]);
				count++;
				hashmap.put(getWordArray()[i], count);
			}
			else {
				count++;
				hashmap.put(getWordArray()[i], count);
			}
			
		}
		return hashmap;
	}
	
//	part1
//	public static void main(String[] args) {
//		String para1="You can discover more about a person in an hour of play than in a year of conversation";
//		String para2="When you play play hard when you work dont play at all"; 
//		WordGroup Obj1=new WordGroup(para1);
//		WordGroup Obj2=new WordGroup(para2);
//		for (int i = 0; i <Obj1.getWordArray().length; i++) {
//			System.out.println(Obj1.getWordArray()[i]);
//		}
//		System.out.println("********************");
//		for (int i = 0; i < Obj2.getWordArray().length; i++) {
//			System.out.println(Obj2.getWordArray()[i]);
//		}
//	}
	
//	part2
//	public static void main(String[] args) {
//		String para1="You can discover more about a person in an hour of play than in a year of conversation";
//		String para2="When you play play hard when you work dont play at all"; 
//		WordGroup obj1=new WordGroup(para1);
//		WordGroup obj2=new WordGroup(para2);
//		
//		HashSet<String> hashset1 =new HashSet<String>();
//		hashset1=obj1.getWordSet(obj2);
//		System.out.println(hashset1);
//		System.out.println("*******************");
//		HashSet<String> hashset2=new HashSet<String>();
//		hashset2=obj2.getWordSet(obj1);
//		System.out.println(hashset2);
//		System.out.println(hashset1.equals(hashset2));
//	}
	
//	part3
	public static void main(String[] args) {
		String para1="You can discover more about a person in an hour of play than in a year of conversation";
		String para2="When you play play hard when you work dont play at all"; 
		WordGroup obj1=new WordGroup(para1);
		WordGroup obj2=new WordGroup(para2);
		
		HashMap<String,Integer> hashmap1=new HashMap<String,Integer>();
		hashmap1=obj1.getWordCounts();
		
		for(String key: hashmap1.keySet()) {
			System.out.println(key+":"+hashmap1.get(key));
		}
		System.out.println("*******************");
		
		HashMap<String,Integer> hashmap2=new HashMap<String,Integer>();
		hashmap2=obj2.getWordCounts();
		
		for (String key: hashmap2.keySet()) {
			System.out.println(key+":"+hashmap2.get(key));
		}
	}
}
