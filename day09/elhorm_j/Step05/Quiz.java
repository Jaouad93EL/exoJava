import java.util.*;

public class Quiz extends Game {
    
    List<Question> questions;
    
    public Quiz(String name, Key keyCondition, Key keyReward, List<Question> questions) {
	super(name, keyCondition, keyReward);
	this.questions = questions;
    }

    public boolean play(Key keyCondition, String input) {
	if (this.getKeyCondition() != null || keyCondition != null)
	    if (!this.getKeyCondition().equals(keyCondition)) {
		System.out.println("Key required");
		return false;
	    }
	System.out.println("Welcome to the quiz!");
	int verif = 0;
	int i = 0;
	String[] tab = input.split(" ");
       	for (Question q : questions) {
	    System.out.println(q.getQuestion()
			       + '\n' + q.getResponse1()
			       + '\n' + q.getResponse2()
			       + '\n' + q.getResponse3()
			       + '\n' + q.getResponse4());
	    while (i < tab.length) {
		if (tab[i].equals(q.getAnswer())) {
		    System.out.println("Correct");
		    ++verif;
		    break;
		}
		++i;
            }
	    if (i == tab.length) {
		System.out.println("Wrong");
		return false;
	    }
	}
	if (verif == questions.size()) {
	    System.out.println("Win");
	    return true;
	}
	return false;
    }

    public Key reward() {return this.getKeyReward();}
    public boolean canPlay(Key k) {return true;}
}
