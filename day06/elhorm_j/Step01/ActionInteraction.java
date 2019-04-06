public class ActionInteraction implements Reaction {
    @Override
    public String getTextOfReaction() {
	return "Player talks to someone";
    }
    @Override
    public ReactionType getTypeReaction() {
	return ReactionType.Talk;
    }
	
}
