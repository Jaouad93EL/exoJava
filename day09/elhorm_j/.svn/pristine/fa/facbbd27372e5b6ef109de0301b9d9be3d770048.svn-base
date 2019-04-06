public class GameRunner {

    private String input;
    private Key keyToPlay;

    public GameRunner(Key key,String input) {
	this.input = input;
	this.keyToPlay = key;
    }

    public void setInput(String input) {this.input = input;}
    public void setKeyToPlay(Key key) {this.keyToPlay = key;}
    public String getInput() {return this.input;}
    public Key getKeyToPlay() {return this.keyToPlay;}

    public boolean playGame(Game game) {
	return game.play(this.keyToPlay, this.input);
    }
}
