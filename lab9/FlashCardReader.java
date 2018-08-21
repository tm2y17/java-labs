package lab9;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class FlashCardReader {
	BufferedReader bReader;
	ArrayList<FlashCard> list =new ArrayList<FlashCard>();
	
	public FlashCardReader() {
		FileReader fr;
		try {
			fr = new FileReader("src/lab9/Questions.txt");
			BufferedReader br=new BufferedReader(fr);
			this.bReader=br;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public String getLine() throws Exception {
		return bReader.readLine();
	}
	
	public boolean hasRead() {
		return false;
	}
	
	public ArrayList<FlashCard> getFlashCards() {
		return list;
	}
	
}
