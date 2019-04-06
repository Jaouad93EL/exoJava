public class PlusMinusGame extends Game {
    int findValue;
    public PlusMinusGame(String name, Key keyCondition, Key keyReward, int findValue) {
	super(name, keyCondition, keyReward);
	this.findValue = findValue;
    }

    public boolean play(Key k,String input) {
	if (this.getKeyCondition() != null || k != null)
	    if (!this.getKeyCondition().equals(k)) {
		System.out.println("Key required");
		return false;
	}
	System.out.println("Welcome to the " + this.getName()+ " game!");
	String[] tab = input.split(" ");
	for (int i = 0; i < tab.length && i < 10; ++i) {
	    if (this.findValue == Integer.parseInt(tab[i])) {
		System.out.println("Win");
		return true;
	    }
	    if (this.findValue < Integer.parseInt(tab[i]))
		System.out.println("Lower");
	    if (this.findValue > Integer.parseInt(tab[i]))
		System.out.println("Greater");
	}
	System.out.println("Lose");
	return false;
    }

    public Key reward() {return this.getKeyReward();}
    public boolean canPlay(Key k) {return true;}
}
