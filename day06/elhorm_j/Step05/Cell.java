import java.util.*;

public class Cell {

    List<Reaction> reactions;

    public Cell() {
	this.reactions = new ArrayList<>();
    }

    public void addReaction(Reaction reaction) {
	this.reactions.add(reaction);
    }

    public void removeReaction(Reaction reaction) {
	this.reactions.remove(reaction);
    }

    public void applyReactions(Player player) {
	for (Reaction r : this.reactions)
	    r.action(player);
    }
}
