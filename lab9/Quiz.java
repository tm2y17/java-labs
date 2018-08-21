package lab9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Quiz {
	FlashCardReader fr=new FlashCardReader();
	ArrayList<FlashCard> flashCardList=new ArrayList<>();
	ArrayList<String> userAnswerList=new ArrayList<>();
	private boolean WantToSave=false;
	private int score=0;
	
	public Quiz() throws Exception {
		String line;
		//separate the question and answer; 
		while ((line = fr.getLine()) != null) {
			String delimeter=":";
			String[] temp=line.split(delimeter);
			String question=temp[0];
			String answer=temp[1];
			FlashCard fc=new FlashCard(question, answer);
			fr.getFlashCards().add(fc);
		}
		flashCardList=fr.getFlashCards();
		this.play();
		if(isWantToSave()) {
			this.save();
		}
		
	}
	
	public void play() throws InterruptedException {
		for(int i=0;i<flashCardList.size();i++) {
			System.out.println(flashCardList.get(i).getQuestion());
			
			Thread.sleep(1);
			Toolbox tool=new Toolbox();
			String userAnswer=tool.readStringFromCmd();
			userAnswerList.add(userAnswer);
			
			if(!userAnswer.equals(flashCardList.get(i).getAnswer())) {
				System.out.println("Wrong! ");
				System.out.println("Answer: "+flashCardList.get(i).getAnswer());
				System.out.println();
			}
			else {
				System.out.println("Right, Good job!");
				setScore(getScore()+1);
			}
		}
		System.out.println("Do you want to save your quiz result? Y/N");
		Toolbox tool=new Toolbox();
		String userAnswer=tool.readStringFromCmd();
		if(userAnswer.equals("Y")){
			setWantToSave(true);
		}
			
	}
	
	public void save() throws FileNotFoundException {
		PrintStream out = new PrintStream(new FileOutputStream("src/lab9/save.txt"));
		for(int i=0;i<userAnswerList.size();i++) {
			out.println(userAnswerList.get(i)+","+userAnswerList.get(i).equals(flashCardList.get(i).getAnswer()));
		}
		double perScore=getScore()/(double)userAnswerList.size();
		out.println("Your Score: "+perScore*100);
		out.close();
	}
	
	public static void main(String[] args) throws Exception {
		Quiz start=new Quiz();
	}

	public boolean isWantToSave() {
		return WantToSave;
	}

	public void setWantToSave(boolean wantToSave) {
		WantToSave = wantToSave;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
