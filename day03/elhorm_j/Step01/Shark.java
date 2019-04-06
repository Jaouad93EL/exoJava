import java.util.List;

public class Shark extends Fish {

    private int nbEatenFishes;
    
    public Shark(String name) {
	super(name);
    }

    public int getNbEatenFishes() {return this.nbEatenFishes;}
    public void setNbEatenFishes(int nbEatenFishes) {this.nbEatenFishes = nbEatenFishes;} 
    
    public void say() {
	System.out.println(this.name + " say : I'm Hungry!");
    }

    public void eat(Goldfish fish) {
	this.nbEatenFishes += 1;
    }

    public void eat(List<Goldfish> fishes) {
	for (int i = 0; i < fishes.size(); ++i)
	    this.nbEatenFishes++;
    }
}
